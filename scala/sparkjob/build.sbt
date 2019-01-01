// resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
resolvers += Resolver.mavenLocal
resolvers += Resolver.url("bintray-sbt-plugins", url("https://dl.bintray.com/eed3si9n/sbt-plugins/"))(Resolver.ivyStylePatterns)


name := "sparkjob"

version := "0.1"

scalaVersion := "2.11.12"
val sparkVersion = "2.4.0"

//unmanagedBase <<= baseDirectory { base => base / "lib" }

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
//  "org.apache.spark" %% "spark-mllib" % sparkVersion,
//  "org.apache.spark" %% "spark-streaming" % sparkVersion,
//  "org.apache.spark" %% "spark-hive" % sparkVersion,
//  "mysql" %% "mysql-connector-java" % "5.1.6",
//  "com.eed3si9n" %% "sbt-assembly" % "0.14.4"
)

unmanagedJars in Compile += file("lib/bingo-core-logic-1.0.4.10.jar")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
