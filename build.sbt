
name := "finagle-stack-starter-kit"

version := "0.1.0"

scalaVersion := "2.10.3"


resolvers ++= Seq("sonatype" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "twitter.com" at "http://maven.twttr.com/")

libraryDependencies <++= (scalaVersion) { scalaVersion =>
  Seq(
    "com.twitter" %% "finagle-core" % "6.22.0",
    "com.twitter" %% "finagle-http" % "6.22.0",   
    "org.scalatest" %% "scalatest" % "2.2.1" % "test",
   "com.twitter" %% "util-core" % "6.22.0",
	"com.twitter" %% "ostrich" % "9.5.2"
	)
	}
	