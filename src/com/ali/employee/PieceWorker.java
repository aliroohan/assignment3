package com.ali.employee;

public class PieceWorker extends Employee{
    private double wagePerPiece;
    private int quantity;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wagePerPiece, int quantity,Date date) {
        super(firstName, lastName, socialSecurityNumber,date);
        setWagePerPiece(wagePerPiece);
        setQuantity(quantity);
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        if (wagePerPiece < 0.0) {
            throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        }
        this.wagePerPiece = wagePerPiece;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    public double earnings() {
        return getWagePerPiece() * getQuantity();
    }

    @Override
    public String toString() {
        return String.format("Piece worker: %s\n%s: $%,.2f \n%s: %d", super.toString(), "Wage per piece", getWagePerPiece(), "Quantity", getQuantity());
    }
}
