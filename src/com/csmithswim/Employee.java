package com.csmithswim;
import java.util.Objects;

//With encapsulation, make sure that any fields/methods for this particular class are stored in this class

public class Employee extends GroceryStore {

    public String fName;
    public String lName;
    private Double hours;
    private double extraHours;
    private Double hourlyRate;

    //This constructor
    public Employee(String fName, String lName,
                    double hours, double extraHours,
                    double hourlyRate) {
        super(true);
        this.fName = fName;
        this.lName = lName;
        setHourlyRate(hourlyRate);
        setHours(hours);
    }

    public static int numberOfEmployees;

    //    @Override //Override method that is checking if an object is referencing the same object.

    //    public boolean equals(Object obj) {
    //        if (this == obj)
    //            return true;
    //    }

    //    Override hashCode method that maps multiple objects and put them in an array.

    //    public int hashCode() {
    //        Objects.hash(x, y)
    //    }

    //Method Overriding
    @Override
    public String toString() {
    return fName;
    }

    //This method is to illustrate polymorphism, make sure that the constructor in both parent and subclasses are disabled to be able to use.
    @Override
    public void slogan() {
        System.out.println("Hello I am an employee");
    }

    public double calculateGrossPaycheck(double extraHours) {
        return (getHours() + extraHours) * getHourlyRate();
    }

    //Method overriding to make the extraHous to be zero.
    public double calculateGrossPaycheck() {
        return calculateGrossPaycheck(0);
    }

    //Private setters/getters which illustrate abstraction
    private void setHourlyRate(double hourlyRate){
        if (hourlyRate < 11.75)
            throw new IllegalArgumentException("Hourly Rate cannot be less than 11.75 dollars an hour");
        this.hourlyRate = hourlyRate;
    }

    private double getHourlyRate(){
        return hourlyRate;
    }

    private Double getHours() {
        return hours;
    }

    private void setHours(Double hours) {
        if (hours > 40)
            throw new IllegalArgumentException("Hours cannot exceed 40 for a week");
        this.hours = hours;
    }
}
