organization := "org.scalablytyped"
name := "angular-agility"
version := "0.0-unknown-/mcallisto/Converter.git-19700101Z-03832e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-/mcallisto/Converter.git-19700101Z-e8fa7b",
  "org.scalablytyped" %%% "std" % "0.0-unknown-/mcallisto/Converter.git-19700101Z-137e2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
