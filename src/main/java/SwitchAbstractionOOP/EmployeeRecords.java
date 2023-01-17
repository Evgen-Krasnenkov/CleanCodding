package SwitchAbstractionOOP;

public class EmployeeRecords {
    private String name;
    private String SIN;
    private int rate;
    public Type type;

    public EmployeeRecords(String name, String SIN, int rate, Type type) {
        this.name = name;
        this.SIN = SIN;
        this.rate = rate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
