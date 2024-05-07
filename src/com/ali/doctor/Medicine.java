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
        return String.format("%s: %d\n%s: %s\n%s: %d\n%s: %.2f\n",
                "MedicineId", getMedId(),
                "Medicine Name", getMedName(),
                "Medicine Quantity", getMedQty(),
                "Medicine Price", getMedPrice()
        );
    }

    public Medicine(String medName, int medId, double medPrice, int medQty) {
        this.setMedName(medName);
        this.setMedId(medId);
        this.setMedPrice(medPrice);
        this.setMedQty(medQty);
    }
}
