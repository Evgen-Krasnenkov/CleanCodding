package com.cleancode.switchabstraction;

import java.util.Currency;

public class CommissionBasedEmployee extends Employee {
    private int commissionPercent;
    @Override
    public boolean isPayDay() {
        System.out.println("Commission paid 15 GBP");
        return false;
    }

    @Override
    public Money calculatePay() {
        System.out.println("Commission calculate pay of 15 GBP");
        return new MoneyBuilder().setAmount(15).setCurrency(Currency.getInstance("GBP")).createMoney();
    }

    @Override
    public void deliverPay(Money pay) {
        System.out.println("Commission `5 GBP paid");
    }

    public int getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }
}
