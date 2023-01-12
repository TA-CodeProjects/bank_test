package com.example.bank_test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class BankTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankTestApplication.class, args);
	}

}
