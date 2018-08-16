name := "simplecuda"
version := "1.0"
scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
	"org.scalactic" %% "scalactic" % "3.0.5",
	"org.scalatest" %% "scalatest" % "3.0.5" % "test",
	"org.nd4j" % "nd4j-cuda-9.2-platform" % "1.0.0-beta2",	
	"org.deeplearning4j" % "deeplearning4j-cuda-9.2" % "1.0.0-beta2"
)