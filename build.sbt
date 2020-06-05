name := "MyNoSQL"

version := "1.0"

scalaVersion := "2.11.11"

val sparkVersion = "2.4.5"


resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.+",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-graphx" % sparkVersion,
  "com.databricks" %% "spark-csv" % "1.3.0"
)