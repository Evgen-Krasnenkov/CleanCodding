package SwitchAbstractionOOP;

import java.util.Currency;

public class HourlyPaidEmployee extends Employee{
    private int rate;
    @Override
    public boolean isPayDay() {
        System.out.println("Hourly pay of CAD 30");
        return true;
    }

    @Override
    public Money calculatePay() {
        System.out.println("Full calculate pay of 20 USD");
        return new Money(30, Currency.getInstance("CAD"));
    }

    @Override
    public void deliverPay(Money pay) {
        System.out.println("Hourly was paid 30 CAD");
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
