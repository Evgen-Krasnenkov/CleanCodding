package SwitchAbstractionOOP;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee makeEmployee(EmployeeRecords employeeRecords) throws InvalidEmployeeTypeException {
        switch (employeeRecords.type){
            case FULL_TIME -> {
                return new FullTimeEmployee();
            }
            case HOURLY_PAID -> {
                return new HourlyPaidEmployee();
            }
            case COMMISSIONED -> {
                return new CommissionBasedEmployee();
            }
            default -> throw new InvalidEmployeeTypeException("Wrong employee type!");
        }
    }
}
