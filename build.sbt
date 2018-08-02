name := """codegrep"""
organization := "in.syam"

version := "1.6-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.sksamuel.elastic4s" %% "elastic4s-http" % "6.2.4"
libraryDependencies += "com.sksamuel.elastic4s" %% "elastic4s-circe" % "6.2.4"

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += ws
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.12.6"

libraryDependencies += "org.eclipse.platform" % "org.eclipse.equinox.app" % "1.3.500"
libraryDependencies += "org.eclipse.jdt" % "org.eclipse.jdt.core" % "3.14.0"



libraryDependencies += "org.scalameta" %% "scalameta" % "3.7.4"

