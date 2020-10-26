package com.csmithswim;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    @Override //Best practice to use annotation to tell the java compiler that this is the implementation of the calculateTax method in our interface
    public double calculateTax(){
        return taxableIncome * .3;
    }

}
