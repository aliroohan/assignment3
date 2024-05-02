package com.ali.employee;

public class SalariedEmployees extends Employee{
    private double weeklySalary;

    public SalariedEmployees(String firstName, String lastName, String socialSecurityNumber, double weeklySalary,Date date) {
        super(firstName, lastName, socialSecurityNumber, date);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }


    public double earnings() {
        return weeklySalary;
    }




    public String toString(){
        return String.format("Salaried employee: %s\n%s$%,.2f", super.toString(), "Weekly salary : ", earnings());
    }

}
