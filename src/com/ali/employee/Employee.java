package com.ali.employee;

import java.time.LocalDate;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;


    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s", firstName, lastName, socialSecurityNumber);
    }


    public static double payroll(Employee employee) {
        double pay = 0;
        if (employee instanceof BasePlusCommissionEmpolyee || LocalDate.now().getMonthValue() == employee.birthDate.getMonth()) {
            pay = employee.earnings() + employee.earnings() * .1 + 100;
        } else {
            pay = employee.earnings() + employee.earnings() * .1;
        }
        return pay;
    }
}