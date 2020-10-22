package com.csmithswim;

public class Employee {
    public String fName;
    public String lName;
    private Double hours;
    private double extraHours;
    private Double hourlyRate;
    public boolean isWorking;

    public Employee(String fName) {
        this(fName,"smith", 0, 0, 11.75, false);
    }

    public Employee(String fName, String lName, double hours, double extraHours,  double hourlyRate, boolean isWorking) {
        this.fName = fName;
        this.lName = lName;
        setHourlyRate(hourlyRate);
        setHours(hours);
        isWorking = false;
    }

    public double calculateGrossPaycheck(double extraHours) {
        return (getHours() + extraHours) * getHourlyRate();
    }

    public double calculateGrossPaycheck() {
        return calculateGrossPaycheck(0);
    }

    private void setHourlyRate(double hourlyRate){
        if (hourlyRate <= 11.75)
            throw new IllegalArgumentException("Hourly Rate cannot be less than 11.75 dollars an hour");
        this.hourlyRate = hourlyRate;
    }

    private double getHourlyRate(){
        return hourlyRate;
    }

    public static int numberOfEmployees;

    private Double getHours() {
        return hours;
    }

    private void setHours(Double hours) {
        if (hours > 40)
            throw new IllegalArgumentException("Hours cannot exceed 40 for a week");
        this.hours = hours;
    }
}
