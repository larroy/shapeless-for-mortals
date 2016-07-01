lazy val commonSettings = Seq(
  version := "0.1",
  organization := "com.larroy",
  name := "parser",
  scalaVersion := "2.11.8",
  scalacOptions := Seq(
    "-target:jvm-1.8",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-encoding", "utf8",
    "-Xlint"

  ),
  resolvers ++= Seq(
    Resolver.mavenLocal,
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots"),
    Resolver.bintrayRepo("scalaz", "releases"),
    Resolver.bintrayRepo("megamsys", "scala"),
    "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
  )
)

lazy val commonDependencies = Seq(
  "org.slf4j" % "jcl-over-slf4j" % "1.7.7",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.iheart" %% "ficus" % "1.2.3",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.typelevel" %% "cats" % "0.6.0",
  "com.chuusai" %% "shapeless" % "2.3.1"
)

lazy val testDependencies = Seq(
  "org.specs2" %% "specs2" % "3.+" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

lazy val root = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= commonDependencies)
  .settings(libraryDependencies ++= testDependencies)

