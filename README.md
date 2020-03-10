# Recipe-Calorie-Alert-using-Kafka

Building a system with Kafka, that pulls live Twitter tweets from it's online API, parses them, and outputs the number of hashtags in each tweet.
the system uses microservices written in Scala, that communicate through a Kafka topic.
One service pulls live tweets from Twitter and publishes them to a Kafka topic named "tweets",
the other service read the data from the topic, count and outputs the number of hashtags.

## Installation

add Twitter4j and Kafka dependencies to the build.sbt file:

For producer:
libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "org.apache.kafka" % "kafka_2.11" % "0.10.0.0"
)

For consumer:
libraryDependencies += "org.apache.kafka" % "kafka_2.12" % "0.10.1.1" withSources() exclude("org.slf4j","slf4j-log4j12") exclude("javax.jms", "jms") exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri")

## Usage

1. start zookeeper (on Windows, run ".\bin\windows\zookeeper-server-start.bat config/zookeeper.properties" in the kafka directory)
2. start Kafka server (on Windows, run ".\bin\windows\kafka-server-start.bat config/server.properties" in the kafka directory)
3. run producer
4. run consumer

## Credits

credit to Saumitra Srivastav for his tutorial on using Scala microservices communicating with Kafka, using the Twitter4j API!!
( https://dzone.com/articles/deploying-kafka-dependent-scala-microservices-with )
