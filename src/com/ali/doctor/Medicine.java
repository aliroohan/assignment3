package com.ali.doctor;

public class Medicine {
    private String medName;
    private int medId;
    private double medPrice;
    private int medQty;

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public double getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(double medPrice) {
        this.medPrice = medPrice;
    }

    public int getMedQty() {
        return medQty;
    }

    public void setMedQty(int medQty) {
        this.medQty = medQty;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medName='" + medName + '\'' +
                ", medId=" + medId +
                ", medPrice=" + medPrice +
                ", medQty=" + medQty +
                '}';
    }
}
