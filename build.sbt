ThisBuild / gradleEnterpriseConfiguration :=
    GradleEnterpriseConfiguration(
      buildScan = BuildScan(
        termsOfService = Some(url("https://gradle.com/terms-of-service") -> areTermsAccepted)))

lazy val `sbt-build-scan-quickstart` = (project in file("."))
  .settings(
    Test / testOptions += Tests.Argument(TestFrameworks.MUnit, "+l"),
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),
  )

val termsAcceptedSysProp = "gradle.terms-of-service.accept"
lazy val areTermsAccepted = sys.BooleanProp.valueIsTrue(termsAcceptedSysProp)

initialize := {
  if (!areTermsAccepted) {
    sLog.value.warn(s"To publish a Build Scan® on this project start sbt with `-D$termsAcceptedSysProp=true`. By doing so, you accept the Gradle Terms of Service: https://gradle.com/terms-of-service")
    sys.exit(1)
  }
}
