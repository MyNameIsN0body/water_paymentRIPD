package io.water_payment.model;

public class Account {
    private double balance;

    public Account(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }else {
            this.balance = 0;
        }
    }

    public void deposit(final double amt){
        if (amt > 0) {
            this.balance += amt;
        }
    }
    public void withdraw(double amt) {
//        if (amt <= balance) {
        balance -= amt;
//        }
    }
    public double getBalance() {
        return balance;
    }
}