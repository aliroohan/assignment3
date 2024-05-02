package com.ali.employee;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours,Date date) {
        super(firstName, lastName, socialSecurityNumber, date);
        setWage(wage);
        setHours(hours);
    }

    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    public String toString() {
        return String.format("Hourly employee: %s\n%s: $%,.2f \n%s: %,.2f", super.toString(), "Hourly wage", getWage(), "Hours worked", getHours());
    }
}
