name := "untitled1"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies ++= spark("core","sql")


libraryDependencies += "fr.jetoile.hadoop" % "hadoop-unit-commons" % "2.9" % Test



def spark(modules:String*) = modules.map(module => "org.apache.spark" %% s"spark-$module" % "2.3.0" % Provided)