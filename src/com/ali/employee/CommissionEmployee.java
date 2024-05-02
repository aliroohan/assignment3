package com.ali.employee;

public class CommissionEmployee extends Employee{
    private int grossSales;
    private double commissionRate;

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int grossSales, double commissionRate, Date date) {
        super(firstName, lastName, socialSecurityNumber, date);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission employee: %s\n%s$%d \n%s%.2f", super.toString(), "Gross sales : ", getGrossSales(), "Commission rate : ", getCommissionRate());
    }
}
