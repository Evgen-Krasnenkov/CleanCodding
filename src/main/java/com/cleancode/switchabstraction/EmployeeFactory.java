package com.cleancode.switchabstraction;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecords employeeRecords) throws InvalidEmployeeTypeException;
}
