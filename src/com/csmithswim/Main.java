package com.csmithswim;

public class Main {
    public static void main(String[] args) {
        new Employee("joe");//
        Employee employee1 = new Employee(
                "john", "smith",
                40, 15, 15);

//        double payCheck = employee1.calculateGrossPaycheck();

        System.out.println(employee1.toString());
    }
}
