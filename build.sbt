name := """codegrep"""
organization := "in.syam"

version := "1.0-SNAPSHOT"

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

libraryDependencies += "org.antlr" % "antlr4" % "4.7.1"
libraryDependencies += "org.apache.tika" % "tika-core" % "1.18"


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "in.syam.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "in.syam.binders._"
