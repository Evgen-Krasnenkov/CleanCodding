package com.cleancode.switchabstraction;

public abstract class Employee {
    public String name;

    public Employee() {
    }

    public abstract boolean isPayDay();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);

    void printMethod(){
        System.out.println("Employee print method");
    }
}
