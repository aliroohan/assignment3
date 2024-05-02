package com.ali.doctor;

public class MedicalTest {
    private String testName;
    private int testId;
    private double testPrice;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public double getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(double testPrice) {
        this.testPrice = testPrice;
    }

    @Override
    public String toString() {
        return "MedicalTest{" +
                "testName='" + testName + '\'' +
                ", testId=" + testId +
                ", testPrice=" + testPrice +
                '}';
    }
}
