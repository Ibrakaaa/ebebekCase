package com.ebebek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {


    @Test
    @DisplayName("Tax Test")
    void taxTest() {
        Employee firstEmployee = new Employee("İbrahim", 2000.0, 40, 2015);
        // Set his salary as 2000.0 TL. So he should give %3 tax and that equals = 60 TL.

        firstEmployee.tax();
        firstEmployee.bonus();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary; //Mentioned here as totalSalary: Salary - Tax.
        assertEquals(1940, newSalary);


    }

    @Test
    @DisplayName("Bonus Test")
     void bonusTest() {
        Employee firstEmployee = new Employee("İbrahim", 1000.0, 41, 2015);
        int bonusHour = (firstEmployee.workHours-40);
        System.out.println("Bonus Hour(s): "+ bonusHour+" Hour(s)");
        System.out.println("Bonus price per hour: 30 TL");
        firstEmployee.bonus();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary; // Mentioned here as totalSalary: Salary + Bonus.
        assertEquals(1030, newSalary);


    }
    @Test
    @DisplayName("Net Salary Test")
    void netSalaryTest(){
        Employee firstEmployee = new Employee("İbrahim", 2000.0, 41, 2012);
        firstEmployee.bonus();
        firstEmployee.tax();
        firstEmployee.totalSalary();


        double newSalary= firstEmployee.totalSalary;// Mentioned here as totalSalary = Salary+Bonus-Tax.
        assertEquals(1969.1,newSalary);


    }



    @Test
    @DisplayName("Raise Test")
    void raiseSalaryTest() {
        Employee firstEmployee = new Employee("İbrahim", 2000.0, 41, 2012);
        // Set total work 9 years. So he should take %5 raise.
        firstEmployee.bonus();
        firstEmployee.tax();
        firstEmployee.netSalary();
        firstEmployee.raiseSalary();



        double tempRaise = firstEmployee.raiseSalary; //Calculated Salary raise after apply tax and bonus to salary.
        assertEquals(98.455, tempRaise);
    }

    @Test
    @DisplayName("Total Salary Test")
    void totalSalaryTest() {
        Employee firstEmployee = new Employee("İbrahim",1000.0,41,2000);

        firstEmployee.bonus();
        firstEmployee.tax();
        firstEmployee.netSalary();
        firstEmployee.raiseSalary();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary;
        assertEquals(1148.965,newSalary);
    }


}