package com.ali.employee;

public class BasePlusCommissionEmpolyee extends CommissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    public BasePlusCommissionEmpolyee(String firstName, String lastName, String socialSecurityNumber, int grossSales, double commissionRate, double baseSalary, Date date) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, date);
        setBaseSalary(baseSalary);
    }


}
