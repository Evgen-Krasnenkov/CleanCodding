package com.cleancode.switchabstraction;

import java.util.Currency;

public class Money {
    private int Amount;
    private Currency currency;

    private Money(int amount, Currency currency) {
        Amount = amount;
        this.currency = currency;
    }

    public static Money createMoney(int amount, Currency currency) {
        return new Money(amount, currency);
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
