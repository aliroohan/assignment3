package com.ali.doctor;

public class Doctor {
    private String docName;
    private int docId;
    private double docFee;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public double getDocFee() {
        return docFee;
    }

    public void setDocFee(double docFee) {
        this.docFee = docFee;
    }

    @Override
    public String toString() {
        return String.format("%s: %d\n%s: %s\n%s: %.2f",
                "DoctorId", getDocId(),
                "Doctor Name", getDocName(),
                "Doctor Fee", getDocFee()
        );
    }

    public Doctor(String docName, int docId, double docFee) {
        this.setDocName(docName);
        this.setDocId(docId);
        this.setDocFee(docFee);
    }
}
