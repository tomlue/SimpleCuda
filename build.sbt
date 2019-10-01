name := "simplecuda"
version := "1.0"
scalaVersion := "2.11.8"

classpathTypes += "maven-plugin"

libraryDependencies ++= Seq(
	"org.scalactic" %% "scalactic" % "3.0.5",
	"org.scalatest" %% "scalatest" % "3.0.5" % "test",
	"org.nd4j" % "nd4j-cuda-10.1-platform" % "1.0.0-beta4",	
	"org.deeplearning4j" % "deeplearning4j-cuda-10.1" % "1.0.0-beta4"
)