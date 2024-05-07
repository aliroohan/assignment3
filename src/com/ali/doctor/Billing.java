package com.ali.doctor;

import java.util.ArrayList;

public class Billing implements Payable{
    private int billId;
    private Doctor docInfo;
    private Patient pInfo;
    private ArrayList<MedicalTest> medTest;
    private ArrayList<Medicine> medList;
    private static int totalBills = 0;

    public Billing(int billId, Doctor docInfo, Patient pInfo, ArrayList<MedicalTest> medTest, ArrayList<Medicine> medList) {
        this.setBillId(billId);
        this.setDocInfo(docInfo);
        this.setpInfo(pInfo);
        this.setMedTest(medTest);
        this.setMedList(medList);
        totalBills++;
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

    public ArrayList<MedicalTest> getMedTest() {
        return medTest;
    }

    public void setMedTest(ArrayList<MedicalTest> medTest) {
        this.medTest = medTest;
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public static int getTotalBills() {
        return totalBills;
    }

    @Override
    public double getPaymentAmount() {
        double totalBills = getDocInfo().getDocFee();
        for (int i = 0; i < getMedTest().size(); i++) {
            totalBills += getMedTest().get(i).getTestPrice();
        }
        for (int i = 0; i < getMedList().size(); i++) {
            totalBills += getMedList().get(i).getMedPrice();
        }
        return totalBills;
    }

    @Override
    public String toString() {
        String medicineDetails = "";
        for (Medicine medicine : medList) {
            medicineDetails += medicine.toString() + "\n";
        }

        String medicalTestDetails = "";
        for (MedicalTest test : medTest) {
            medicalTestDetails += test.toString() + "\n";
        }

        return String.format("%s\n%s: %d\n\n%s\n%s\n\n%s\n%s\n\n%s\n%s\n%s\n%s\n%s: %.2f\n",
                "Billing Details",
                "BillId", getBillId(),
                "Doctor Details", docInfo,
                "Patient Details", pInfo,
                "Medicine Details", medicineDetails,
                "Medical Test Details", medicalTestDetails,
                "Total Billing Amount", getPaymentAmount()
        );
}
}
