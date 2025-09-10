package com.banksse;

import com.banksse.service.SavingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class SavingAccountTests {

    @Test
    void shouldAddCounterAccount() {
        SavingAccount savingAccount = new SavingAccount(new BigDecimal(5000.00), 1540, new BigDecimal("0.05"));
        Integer expectedCounter = 1;
        Integer expectedNumber = 1200;
        assertEquals(expectedNumber, savingAccount.getNumber());
        assertEquals(expectedCounter, savingAccount.getCounter());
    }
}
