package SwitchAbstractionOOP;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecords employeeRecords) throws InvalidEmployeeTypeException;
}
