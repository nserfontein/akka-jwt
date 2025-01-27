name := "akka-jwt"
version := "1.2.0"
organization := "de.innfactory"
description := "akka-http jwt auth directive"
scalaVersion := Version.Scala

scalafmtVersion := "1.2.0"

scalacOptions ++= Seq(
  "-deprecation",
  "-target:jvm-1.8",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-unchecked",
  "-Xlint",
  "-Xlint:missing-interpolator",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

libraryDependencies ++= {
  Seq(
    Library.akkaHttp,
    Library.akkaStreams,
    Library.nimbusJwt,
    TestLibrary.akkaHttp,
    TestLibrary.akkaStreams,
    TestLibrary.scalaTest,
    TestLibrary.scalaCheck
  )
}

scalafmtOnCompile := true
crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.9", scalaVersion.value)

// sbt-bintray options
licenses += ("Apache-2.0", url(
  "http://www.apache.org/licenses/LICENSE-2.0.txt"))
publishTo := Some(
  "Sonatype Snapshots Nexus" at "https://oss.sonatype.org/content/repositories/snapshots")
homepage := Some(url("https://github.com/nserfontein/akka-jwt"))
publishMavenStyle := true

pomExtra :=
  <scm>
    <url>git@github.com:nserfontein/akka-jwt.git</url>
    <connection>scm:git:git@github.com:nserfontein/akka-jwt.git</connection>
  </scm>
    <developers>
      <developer>
        <id>innFactory</id>
        <name>Tobias Jonas</name>
        <email>info@innFactory.de</email>
        <url>https://innFactory.de/</url>
        <organization>innFactory</organization>
        <organizationUrl>https://innFactory.de/</organizationUrl>
        <roles>
          <role>CEO</role>
        </roles>
      </developer>
    </developers>
