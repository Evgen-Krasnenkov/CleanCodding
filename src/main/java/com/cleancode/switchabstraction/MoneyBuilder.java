package com.cleancode.switchabstraction;

import java.util.Currency;

public class MoneyBuilder {
    private int amount;
    private Currency currency;

    public MoneyBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public MoneyBuilder setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Money createMoney() {
        return Money.createMoney(amount, currency);
    }
}