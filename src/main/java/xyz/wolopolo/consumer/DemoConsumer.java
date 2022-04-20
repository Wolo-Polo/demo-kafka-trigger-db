package xyz.wolopolo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer
{
    @KafkaListener(topics = "demo", groupId = "trigger-db")
    public void listen(String message) {
        System.out.println("Received Message in group - trigger-db: " + message);
    }
}
