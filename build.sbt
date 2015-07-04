name := "shikkaku"

organization := "jp.modal.soul"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc(),
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

initialCommands := "import jp.modal.soul.shikkaku._"

