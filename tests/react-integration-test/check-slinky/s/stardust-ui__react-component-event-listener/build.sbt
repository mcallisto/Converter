organization := "org.scalablytyped"
name := "stardust-ui__react-component-event-listener"
version := "0.38.0-/mcallisto/Converter.git-19700101Z-f19e2f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped" %%% "react" % "16.9.2-/mcallisto/Converter.git-19700101Z-1d1b1c",
  "org.scalablytyped" %%% "std" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-ba38f1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
