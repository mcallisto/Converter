organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-/mcallisto/Converter.git-19700101Z-c132ab"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-69402a",
  "org.scalablytyped" %%% "vue" % "2.5.13-/mcallisto/Converter.git-19700101Z-23da8f",
  "org.scalablytyped" %%% "webpack-env" % "1.13-/mcallisto/Converter.git-19700101Z-578204")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
