package com.ali.employee;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day < 1 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("Day out of range for the specified month and year");
        }
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("Year must be >= 1900 and <= 2100");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
