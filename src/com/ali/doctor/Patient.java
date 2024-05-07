package com.ali.doctor;

public class Patient {
    private String pName;
    private String pDisease;
    private int pId;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDisease() {
        return pDisease;
    }

    public void setpDisease(String pDisease) {
        this.pDisease = pDisease;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        return String.format("%s: %d\n%s: %s\n%s: %s",
                "PatientId", getpId(),
                "Patient Name", getpName(),
                "Patient Fee", getpDisease()
        );
    }

    public Patient(String pName, String pDisease, int pId) {
        this.setpName(pName);
        this.setpDisease(pDisease);
        this.setpId(pId);
    }
}
