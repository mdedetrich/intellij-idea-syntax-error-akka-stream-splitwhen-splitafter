val akkaVersion = "2.6.15"

ThisBuild / scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion
)
