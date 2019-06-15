package com.company;

/////////////////////////////*         CONSTRUCTORS                 *//////////////////////////////////////////
public class vipCustomer {

    private String name;
    private int balance;
    private String eMail;


    public vipCustomer() {
        this("jacek", 1000, "jacek@gmail.com");
    }

    public vipCustomer(String name, int balance) {
        this(name, balance, "hoe@gmail.com");
    }

    public vipCustomer(String name, int balance, String eMail) {
        this.name = name;
        this.balance = balance;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String geteMail() {
        return eMail;
    }
}