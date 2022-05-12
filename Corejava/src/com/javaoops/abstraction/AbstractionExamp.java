package com.javaoops.abstraction;

abstract class Employee {
    Employee() {
        System.out.println("Employee is created");

    }

    abstract void printSalary();

    void designationUpdate() {
        System.out.println("Designation will be updated soon");

    }
}

class HR extends Employee {

    void printSalary() {
        System.out.println("printing the salary....");
    }
}

class AbstractionExamp {
    public static void main(String args[]) {
        HR obj = new HR();
        obj.printSalary();
        obj.designationUpdate();
    }
}