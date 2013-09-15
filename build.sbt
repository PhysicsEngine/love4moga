name := "moga"

organization := "shoe116"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test",
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.twitter4j" % "twitter4j-core"  % "3.0.3",
  "org.twitter4j" % "twitter4j-async" % "3.0.3",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.2",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2",
  "org.clapper" %% "argot" % "1.0.1"
)

initialCommands := "import shoe116.moga._"
