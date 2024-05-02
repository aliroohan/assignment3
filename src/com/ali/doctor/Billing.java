package com.ali.doctor;

import java.util.ArrayList;

public class Billing implements Payable{
    private int billId;
    private Doctor docInfo;
    private Patient pInfo;
    private ArrayList<MedicalTest> medtest;
    private ArrayList<Medicine> medList;
    private int totalBills;

    public Billing(int billId, Doctor docInfo, Patient pInfo, ArrayList<MedicalTest> medtest, ArrayList<Medicine> medList, int totalBills) {
        this.setBillId(billId);
        this.setDocInfo(docInfo);
        this.setpInfo(pInfo);
        this.setMedtest(medtest);
        this.setMedList(medList);
        this.setTotalBills(totalBills);
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Doctor getDocInfo() {
        return docInfo;
    }

    public void setDocInfo(Doctor docInfo) {
        this.docInfo = docInfo;
    }

    public Patient getpInfo() {
        return pInfo;
    }

    public void setpInfo(Patient pInfo) {
        this.pInfo = pInfo;
    }

    public ArrayList<MedicalTest> getMedtest() {
        return medtest;
    }

    public void setMedtest(ArrayList<MedicalTest> medtest) {
        this.medtest = medtest;
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public int getTotalBills() {
        return totalBills;
    }

    public void setTotalBills(int totalBills) {
        this.totalBills = totalBills;
    }

    @Override
    public double getPaymentAmount() {
        return totalBills;
    }
}
