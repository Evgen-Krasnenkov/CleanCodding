package SwitchAbstractionOOP;

public class SwitchAbstractionOOP {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        try {
            Employee commissionEmployee = employeeFactory.makeEmployee(
                    new EmployeeRecords("CommissionEmployee", "12234", 2, Type.COMMISSIONED));
            Employee fullTimeEmployee = employeeFactory.makeEmployee(
                    new EmployeeRecords("FullTimeEmployee", "09876", 2, Type.FULL_TIME));
            Employee hourlyEmployee = employeeFactory.makeEmployee(
                    new EmployeeRecords("HourlyEmployee", "abcd", 2, Type.HOURLY_PAID));
            commissionEmployee.printMethod();
            fullTimeEmployee.printMethod();
            hourlyEmployee.printMethod();
        } catch (InvalidEmployeeTypeException e) {
            throw new RuntimeException(e);
        }
    }
}
