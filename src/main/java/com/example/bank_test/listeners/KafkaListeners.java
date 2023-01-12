package com.example.bank_test.listeners;

import com.example.bank_test.beans.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "bankTransactions", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
