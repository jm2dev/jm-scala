name := "Sbt Test"

version := "1.0"

scalaVersion := "2.9.0"

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8" % "test",
    "commons-logging" % "commons-logging" % "1.1.1",
    "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test",
    "org.scalatest" % "scalatest_2.9.0" % "1.6.1" % "test"
    )
