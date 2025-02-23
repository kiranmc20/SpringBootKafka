package com.jarvis.springbootkafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerSerivce {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeMessage(ConsumerRecord<String, String> record){
        System.out.println("Received message: "+ record.value());
    }

}
