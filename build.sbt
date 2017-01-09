name := """finatra-twirl"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val root = (project in file("."))
  .enablePlugins(SbtTwirl)
  .settings(
    sourceDirectories in (Compile, TwirlKeys.compileTemplates) += (baseDirectory.value.getParentFile / "src" / "main" / "twirl"))

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)

libraryDependencies += "com.twitter" %% "finatra-http" % "2.6.0"
