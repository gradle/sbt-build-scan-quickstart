lazy val `sbt-build-scan-quickstart` = (project in file("."))
  .settings(
    Test / testOptions += Tests.Argument(TestFrameworks.MUnit, "+l"),
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.1.0" % Test
    )
  )
