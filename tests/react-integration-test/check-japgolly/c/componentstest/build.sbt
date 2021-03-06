organization := "org.scalablytyped"
name := "componentstest"
version := "0.0-unknown-/mcallisto/Converter.git-19700101Z-14eb2e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.0",
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "react" % "16.9.2-/mcallisto/Converter.git-19700101Z-6dff73",
  "org.scalablytyped" %%% "std" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-ae7620")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
