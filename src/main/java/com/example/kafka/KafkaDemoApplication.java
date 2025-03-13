package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Start Zookeeper: 
//.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

//Open a new PowerShell window and start Kafka Broker: 
//.\bin\windows\kafka-server-start.bat .\config\server.properties

//Open a new PowerShell window and create a topic: 
//.\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

//Verify topic creation: 
//.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

// Send & Receive Messages
// Start a Kafka Producer: 
//.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic

// Start a Kafka Consumer: 
//.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning


@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}
}
