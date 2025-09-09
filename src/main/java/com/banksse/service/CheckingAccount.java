package com.banksse.service;

import java.math.BigDecimal;
import java.util.Random;

public class CheckingAccount extends Account {
    private Integer number;
    private Integer verifiedDigit;
    private static Integer counter = 1200;


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getVerifiedDigit() {
        return verifiedDigit;
    }

    public void setVerifiedDigit(Integer verifiedDigit) {
        this.verifiedDigit = verifiedDigit;
    }

    public CheckingAccount(BigDecimal balance, Integer agency){
        super.setAgency(agency);
        super.setBalance(balance);
        number = ++counter;
        Random rand = new Random();
        verifiedDigit = rand.nextInt(10);

    }

    public void printAccount(){
        System.out.println(getAgency());
        System.out.println(getBalance());
        System.out.println(number);
        System.out.println(counter);
        System.out.println(verifiedDigit);

    }





}
