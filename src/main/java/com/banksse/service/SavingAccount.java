package com.banksse.service;
import java.math.BigDecimal;
import java.util.logging.Logger;

public class SavingAccount extends Account{
    private static Integer counter = 0;
    private Integer number;
    private BigDecimal rateInterest;
    private BigDecimal withdrawLimit = new BigDecimal(1000.00);
    public Logger logger = Logger.getLogger(SavingAccount.class.getName());

    public SavingAccount(BigDecimal balance, Integer agency, BigDecimal rate){
        logger.info("Class Saving Account Created");
       super.setAgency(agency);
       super.setBalance(balance);
       number = counter++ + 1200;
       rateInterest = rate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        SavingAccount.counter = counter;
    }

    public BigDecimal getRateInterest() {
        return rateInterest;
    }

    public void setRateInterest(BigDecimal rateInterest) {
        this.rateInterest = rateInterest;
    }

    public BigDecimal getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(BigDecimal withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void printAccount(){
        System.out.println("Saving Account");
        System.out.println("number: " + getNumber());
        System.out.println("agency: " + getAgency());
        System.out.println("Rate interest: " + getRateInterest());
        System.out.println("Withdraw limit: " + getWithdrawLimit());
        System.out.println("Balance: " + getBalance());
        System.out.println("Counter: " + getCounter());
    }
}
