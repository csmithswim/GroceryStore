package com.csmithswim;

public class TaxReport {
    private TaxCalculator calculator;

    //Using constructor injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    //Method injection
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    //Setter that injects a dependency in the class
    public void setCalculator(TaxCalculator calculator){
        this.calculator = calculator;
    }
}
