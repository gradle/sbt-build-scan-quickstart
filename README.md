# sbt Build Scan™ quickstart

This is an example project that you can use to experience the [Build Scan™ service of Gradle Enterprise][gradle.com].

It is a small Scala project that has the [Gradle Enterprise sbt plugin][manual] already applied.

## Prerequisite

sbt is expected to be installed. Please, follow [installing sbt](https://www.scala-sbt.org/1.x/docs/Setup.html) for instructions.

## Create a Build Scan™

Follow these simple steps to create and publish a Build Scan™ on [scans.gradle.com][scans.gradle.com]:

1. Clone this project
1. Run `sbt package`

The build should end with something similar to:

    Publishing build scan...
    https://gradle.com/s/ria2s2x5oaazq

Follow the link shown at the end of the build to view your Build Scan™ on [scans.gradle.com][scans.gradle.com].

## Experiment with Build Scans

Create different kinds of Build Scans by locally modifying this quickstart project. Here are some ideas:

- Edit `src/main/scala/example/Example.scala` to introduce compile errors

Alternatively, enable one of your own sbt builds to produce Build Scans by following the [step-by-step instructions][scans.gradle.com].

## Learn more

Read the [Gradle Enterprise sbt plugin User Manual][manual] to learn more about the Build Scan™ service of Gradle Enterprise and the Gradle Enterprise sbt plugin.

## Need help?

Talk to us on the [Gradle forum][gradle-forum].

## License

The sbt Build Scan™ quickstart project is open-source software released under the [Apache 2.0 License][apache-license].

[apache-license]: https://www.apache.org/licenses/LICENSE-2.0.html
[manual]: https://docs.gradle.com/enterprise/sbt-plugin
[gradle.com]: https://www.gradle.com
[terms-of-service]: https://gradle.com/terms-of-service
[scans.gradle.com]: https://scans.gradle.com
[gradle-forum]: https://discuss.gradle.org/c/help-discuss/scans