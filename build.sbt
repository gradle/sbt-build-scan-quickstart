Global / gradleEnterpriseConfiguration :=
    GradleEnterpriseConfiguration(
      buildScan = BuildScan(
        termsOfService = Some(url("https://gradle.com/terms-of-service") -> true)))

lazy val `sbt-build-scan-quickstart` = (project in file("."))
  .settings(
    Test / testOptions += Tests.Argument(TestFrameworks.MUnit, "+l"),
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),
  )
