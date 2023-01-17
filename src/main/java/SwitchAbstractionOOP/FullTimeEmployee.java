package SwitchAbstractionOOP;

import java.util.Currency;

public class FullTimeEmployee extends Employee{
    private String SIN;
    /**
     * @return
     */
    @Override
    public boolean isPayDay() {
        System.out.println("Calculate Full PayDay!");
        return true;
    }

    /**
     * @return
     */
    @Override
    public Money calculatePay() {
        System.out.println("Full calculate pay of 20 USD");
        return new Money(20, Currency.getInstance("USD"));
    }

    /**
     * @param pay
     */
    @Override
    public void deliverPay(Money pay) {
        System.out.println("Full money pay 20 USD");
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }
}
