package com.ebebek;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Halil",1000.0,41,2015);
        firstEmployee.toPrint();
        firstEmployee.raiseSalary();
        firstEmployee.bonus();
        firstEmployee.tax();
        firstEmployee.totalSalary();

    }
}
