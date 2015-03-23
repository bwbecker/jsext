lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "jsext Library for Scala.js"

normalizedName := "querki-jsext"

version := "0.1-SNAPSHOT"

organization := "org.querki"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.6")

//libraryDependencies +=
//  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
//
//jsDependencies +=
//  "org.webjars" % "jquery" % "2.1.3" / "jquery.js"
//
//jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.querki.net/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
    url("https://github.com/jducoeur/jsext"),
    "scm:git:git@github.com/jducoeur/jsext.git",
    Some("scm:git:git@github.com/jducoeur/jsext.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>jducoeur</id>
      <name>Mark Waks</name>
      <url>https://github.com/jducoeur/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }