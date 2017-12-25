package com.carrotgarden.maven.scalor

import java.io.File

/**
 * Shared name space.
 */
object A {

  /**
   * Plugin identity.
   */
  object maven {

    /**
     * Short self name for Maven.
     */
    final val name = "scalor"

    // FIMXE remove
    final val artifactId = "scalor-maven-plugin"
    /**
     * Plugin user property naming pattern: ${plugin.property...}
     */
    final val propertyRegex = ( "^[$][{](" + name + "[.].+)[}]$" ).r

    /**
     * Well known maven plugins.
     */
    final val compilerId = "maven-compiler-plugin"

  }

  /**
   * Plugin identity.
   */
  object eclipse {

    /**
     * Short self name for Eclipse.
     */
    final val name = "scaler"

  }

  /**
   * Mojo names.
   */
  object mojo {

    final val `auto-conf` = "auto-conf"

    final val `register-macro` = "register-macro"
    final val `register-main` = "register-main"
    final val `register-test` = "register-test"

    final val `eclipse-config` = "eclipse-config"
    
//    final val `eclipse-project` = "eclipse-project"
//    final val `eclipse-settings` = "eclipse-settings"
//    final val `eclipse-classpath` = "eclipse-classpath"

    final val `compile-macro` = "compile-macro"
    final val `compile-main` = "compile-main"
    final val `compile-test` = "compile-test"

    final val `link-scala-js-main` = "link-scala-js-main"
    final val `link-scala-js-test` = "link-scala-js-test"

    final val `prepack-linker-main` = "prepack-linker-main"
    final val `prepack-linker-test` = "prepack-linker-test"

    final val `prepack-macro` = "prepack-macro"
    final val `prepack-main` = "prepack-main"
    final val `prepack-test` = "prepack-test"

  }

  /**
   * Parameter names.
   */
  object param {
    def of( name : String ) = A.maven.name + "." + name
  }

}