ThisBuild / organization := "TheDiscProg"

ThisBuild / version := "1.0.0"

lazy val commonSettings = Seq(
  scalaVersion := "2.13.10",
  libraryDependencies ++= Dependencies.all,
  addCompilerPlugin(
    ("org.typelevel" %% "kind-projector" % "0.13.2").cross(CrossVersion.full)
  ),
  addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
)

lazy val root = (project in file("."))
  .enablePlugins(
    ScalafmtPlugin
  )
  .settings(
    commonSettings,
    name := "slogic",
    scalacOptions ++= Scalac.options,
  )

githubOwner := "TheDiscProg"
githubRepository := "slogic"

addCommandAlias("cleanTest", ";clean;scalafmt;test:scalafmt;test;")
addCommandAlias("cleanCoverage", ";clean;scalafmt;test:scalafmt;coverage;test;coverageReport;")
