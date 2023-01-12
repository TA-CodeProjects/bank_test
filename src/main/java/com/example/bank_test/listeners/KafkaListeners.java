package com.example.bank_test.listeners;

import com.example.bank_test.beans.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    Logger logger = LoggerFactory.getLogger(KafkaListeners.class);

    @KafkaListener(topics = "bankTransactions", groupId = "groupId")
    void listener(String data) {
        logger.info(data);
    }
}
