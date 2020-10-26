package com.csmithswim;

public class Register extends GroceryStore {

    double sum;

    public Register(double sum){
        super(true);
       this.sum = sum;
    }

    //This method is to illustrate polymorphism, make sure that the constructor in both parent and subclasses are disabled to be able to use.
    @Override
    public void slogan() {
        System.out.println("Hello I am an Cash Register");
    }
}
