package com.ebebek;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("İbrahim",2000.0,45,2021);
        System.out.println(firstEmployee.toString());
        firstEmployee.tax();
        firstEmployee.bonus();
        firstEmployee.netSalary();
        firstEmployee.raiseSalary();
        firstEmployee.totalSalary();


    }
}
