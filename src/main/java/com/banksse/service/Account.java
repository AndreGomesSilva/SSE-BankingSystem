package com.banksse.service;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

public class Account {
    private Integer agency;
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

}

