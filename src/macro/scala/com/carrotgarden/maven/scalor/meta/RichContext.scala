package com.carrotgarden.maven.scalor.meta

import scala.annotation.tailrec
import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

trait RichContext {

  val c : Context
  import c.universe._

  def prefix( message : String ) = s"Scalor macro: $message"
  def info( message : String ) = c.info( c.enclosingPosition, prefix( message ), true ) // FIXME broken by scala 12.6
  def warn( message : String ) = c.warning( c.enclosingPosition, prefix( message ) )
  def fail( message : String ) = c.abort( c.enclosingPosition, prefix( message ) )

  @tailrec
  final def extractName( tree : c.Tree ) : c.Name = tree match {
    case Ident( name )        => name
    case Select( _, name )    => name
    case Function( _, body )  => extractName( body )
    case Block( _, expr )     => extractName( expr )
    case Apply( func, _ )     => extractName( func )
    case TypeApply( func, _ ) => extractName( func )
    case _                    => fail( s"Unsupported expression: $tree" )
  }

}

