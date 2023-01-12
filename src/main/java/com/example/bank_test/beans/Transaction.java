package com.example.bank_test.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    long id;
    String accountFrom;
    String accountTo;
    double amount;
}
