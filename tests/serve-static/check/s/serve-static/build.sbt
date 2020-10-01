organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-5e9042"
scalaVersion := "0.28.0-bin-20200925-f4528ce-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-f68691",
  "org.scalablytyped" %%% "mime" % "2.0-db1f6b",
  "org.scalablytyped" %%% "std" % "0.0-unknown-248522")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-scalajs")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
