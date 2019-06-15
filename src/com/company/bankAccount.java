package com.company;

import java.sql.SQLOutput;

public class bankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String eMail;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance ;
    }
    public void setCustomerName(String customerName){
        customerName = customerName;
    }
    public void setEMail(String eMail){
         this.eMail= eMail;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String geteMail(){
        return eMail;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void deposit(int money){
        this.balance = this.balance + money;
        System.out.println("You deposited " + money +"$, your balance is now " + balance);
    }
    public void withdraw(int money){
        if(balance - money >= 0){
            this.balance = this.balance - money;
            System.out.println("You withdrawn " + money + "$, your balance is now " + balance);
        } else
            System.out.println("Insufficient funds");
    }
}
