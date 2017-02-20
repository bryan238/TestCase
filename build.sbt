lazy val  scalaTest = libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
lazy val  scalaV = scalaVersion := "2.11.8"

lazy val root = project
  .in(file("."))
  .settings(scalaV)
  .settings(name := "TestCase")
  .aggregate(app, pure)
  .dependsOn(app, pure)

lazy val app = project
  .enablePlugins(JavaAppPackaging)
  .settings(scalaV)
  .settings(name := "TestCase-app")
  .dependsOn(pure)

lazy val pure = project
  .settings(scalaV, scalaTest)