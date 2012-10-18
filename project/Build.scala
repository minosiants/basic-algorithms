import sbt._
import sbt.Keys._


object BasicalgorithmsBuild extends Build {

  lazy val basicalgorithms = Project(
    id = "basic-algorithms",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      	name := "basic-algorithms",
      	organization := "com.minosiants",
      	version := "0.1",
      	scalaVersion := "2.10.0-M7",
      	libraryDependencies ++= Seq(
            "org.specs2" % "specs2_2.10.0-M7" % "1.12.1.1" % "test",
            "junit" % "junit" % "4.10" % "test"
        ),
        resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
        				  "releases"  at "http://oss.sonatype.org/content/repositories/releases")
      
    )

  )
}
