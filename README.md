DEMO KAFKA WITH SPRING BOOT

SETUP:  
~ docker-compose up -d  
~ list topic from cli of container: /usr/bin/kafka-topics --bootstrap-server=localhost:9092 --list  
~ create topic from cli of container: /usr/bin/kafka-topics --create localhost:2181 --replication-factor 1 --partitions 1 --topic demo  
~ create producer for topic 'demo' from cli of container: /usr/bin/kafka-console-producer --bootstrap-server localhost:9092 --topic demo  
~ create consumer for topic 'demo' from cli of container: /usr/bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic demo --from-beginning
