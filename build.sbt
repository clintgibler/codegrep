name := """codegrep"""
organization := "in.syam"

version := "1.3-SNAPSHOT"

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
libraryDependencies += "org.antlr" % "antlr4" % "4.7.1"
//libraryDependencies += "com.tunnelvisionlabs" % "antlr4" % "4.7.1"


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "in.syam.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "in.syam.binders._"
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.12.6"
libraryDependencies += "org.scalameta" %% "scalameta" % "3.7.4"
libraryDependencies += "net.java.dev.jna" % "jna" % "4.5.2"
libraryDependencies += "net.java.dev.jna" % "jna-platform" % "4.5.2"
