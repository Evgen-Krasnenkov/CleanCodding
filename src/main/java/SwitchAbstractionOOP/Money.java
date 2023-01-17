package SwitchAbstractionOOP;

import java.util.Currency;

public class Money {
    private int Amount;
    private Currency currency;

    public Money(int amount, Currency currency) {
        Amount = amount;
        this.currency = currency;
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
