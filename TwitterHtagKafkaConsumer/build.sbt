name := "TwitterHtagKafkaConsumer"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.apache.kafka" % "kafka_2.12" % "0.10.1.1" withSources() exclude("org.slf4j","slf4j-log4j12") exclude("javax.jms", "jms") exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri")