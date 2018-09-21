name := "untitled1"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies ++= spark("core","sql")

libraryDependencies ++= hadoopUnit("commons","windowslibs")




def hadoopUnit(modules:String*) = modules.map(module =>  "fr.jetoile.hadoop" % s"hadoop-unit-$module" % "2.9" % Test)

def spark(modules:String*) = modules.map(module => "org.apache.spark" %% s"spark-$module" % "2.3.0" % Provided)