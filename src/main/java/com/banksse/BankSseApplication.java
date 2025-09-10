package com.banksse;

import com.banksse.service.CheckingAccount;
import com.banksse.service.SavingAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankSseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankSseApplication.class, args);

        CheckingAccount checkingAccount = new CheckingAccount(new BigDecimal(250.50), 1540);
        checkingAccount.printAccount();

        SavingAccount savingAccount = new SavingAccount(new BigDecimal(5000.00), 1540, new BigDecimal("0.05"));
        savingAccount.printAccount();
    }
}