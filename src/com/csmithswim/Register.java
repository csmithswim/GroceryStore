package com.csmithswim;

public class Register extends GroceryStore {

    Double total;
    Double cashInRegister;
    int registerNumber;


    public class Employee extends GroceryStore {

        public String fName;
        public String lName;
        private Double hours;
        private double extraHours;
        private Double hourlyRate;

        public Employee(String fName) {

            this(fName,"smith",
                    0, 0,
                    11.75);
        }

    }
