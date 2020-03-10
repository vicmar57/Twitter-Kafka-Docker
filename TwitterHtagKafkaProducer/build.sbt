name := "TwitterHtagKafkaProducer"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "org.apache.kafka" % "kafka_2.11" % "0.10.0.0"
)