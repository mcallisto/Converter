organization := "org.scalablytyped"
name := "numjs"
version := "0.0-unknown-/mcallisto/Converter.git-19700101Z-3921c8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ndarray" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-a66808",
  "org.scalablytyped" %%% "std" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-c6dcd1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
