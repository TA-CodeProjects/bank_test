package com.example.bank_test.controller;

import com.example.bank_test.beans.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class BankController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("transaction")
    public String getTransaction(@RequestBody Transaction transaction){
        kafkaTemplate.send("bankTransactions", transaction.toString());
        return "ok";
    }

}
