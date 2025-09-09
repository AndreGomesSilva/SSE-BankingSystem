package com.banksse;

import com.banksse.service.CheckingAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankSseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankSseApplication.class, args);

        CheckingAccount conta = new CheckingAccount(new BigDecimal(250.50), 1540);
        conta.printAccount();


    }
}