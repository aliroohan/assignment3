package com.ali.doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Payable> payableList = new ArrayList<>();

        ArrayList<MedicalTest> medTestList1 = new ArrayList<>();
        ArrayList<MedicalTest> medTestList2 = new ArrayList<>();
        ArrayList<MedicalTest> medTestList3 = new ArrayList<>();

        ArrayList<Medicine> medList1 = new ArrayList<>();
        ArrayList<Medicine> medList2 = new ArrayList<>();
        ArrayList<Medicine> medList3 = new ArrayList<>();

        medList1.add(new Medicine("Panadol", 1, 10, 5));
        medList1.add(new Medicine("Napa", 2, 20, 10));
        medTestList1.add(new MedicalTest("Blood Test", 1, 100));
        Doctor d1 = new Doctor("Ali", 1, 2500);
        Patient p1 = new Patient("Ahmed", "Dengue", 25);

        medList2.add(new Medicine("Panadol", 1, 10, 5));
        medList2.add(new Medicine("Napa", 2, 20, 10));
        medList2.add(new Medicine("Disprin", 3, 30, 15));
        medTestList2.add(new MedicalTest("Blood Test", 1, 100));
        medTestList2.add(new MedicalTest("Sugar Test", 2, 200));
        Doctor d2 = new Doctor("Ahmed", 2, 3000);
        Patient p2 = new Patient("Ali", "Malaria", 30);

        medList3.add(new Medicine("Panadol", 1, 10, 5));
        medList3.add(new Medicine("Napa", 2, 20, 10));
        medList3.add(new Medicine("Disprin", 3, 30, 15));
        medTestList3.add(new MedicalTest("Blood Test", 1, 100));
        medTestList3.add(new MedicalTest("Sugar Test", 2, 200));
        Doctor d3 = new Doctor("Khan", 3, 3500);
        Patient p3 = new Patient("Kashif", "Typhoid", 35);


        Billing b1 = new Billing(1, d1, p1, medTestList1, medList1);
        Billing b2 = new Billing(2, d2, p2, medTestList2, medList2);
        Billing b3 = new Billing(3, d3, p3, medTestList3, medList3);

        payableList.add(b1);
        payableList.add(b2);
        payableList.add(b3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess for the total bills: ");
        double guess = sc.nextDouble();

        for (Payable p : payableList) {
            if (p.getPaymentAmount() >= guess) {
                System.out.println(p);
            }
        }

        Doctor[] doctors = new Doctor[2];

        boolean doctorFound = false;

        for (Payable billing : payableList) {
            if (billing instanceof Billing) {
                if (((Billing) billing).getDocInfo().getDocId() == 2) {
                    doctors[0] = ((Billing) billing).getDocInfo();
                    doctorFound = true;
                }
            }
        }
        if (!doctorFound) {
            System.out.println("Doctor ID not found");
        }

        for (Doctor doc : doctors) {
            if (doc != null) {
                System.out.println("Doctor assigned: " + "\n" + doc);
                System.out.println();
            }
        }

        System.out.println("Total number of bills generated: " + Billing.getTotalBills());

    }
}
