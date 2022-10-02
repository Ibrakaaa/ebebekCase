package com.ebebek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {


    @Test
    @DisplayName("Tax Test")
    void tax() {
        Employee firstEmployee = new Employee("Halil", 2000.0, 40, 2015);
        // Set his salary as 2000.0 TL. So he should give %3 tax and that equals = 60 TL.

        firstEmployee.tax();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary; //Mentioned here as totalSalary: Salary - Tax.
        assertEquals(1940, newSalary);


    }

    @Test
    @DisplayName("Bonus Test")
     void bonus() {
        Employee firstEmployee = new Employee("Halil", 1000.0, 41, 2015);
        int bonusHour = (firstEmployee.workHours-40);
        System.out.println("Bonus Hour(s): "+ bonusHour+" Hour(s)");
        System.out.println("Bonus price per hour: 30 TL");
        firstEmployee.bonus();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary; // Mentioned here as totalSalary: Salary + Bonus.
        assertEquals(1030, newSalary);


    }



    @Test
    @DisplayName("Raise Test")
    void raiseSalary() {
        Employee firstEmployee = new Employee("Halil", 1000.0, 40, 2012);
        // Set total work 9 year. So he should take %5 raise.
        firstEmployee.raiseSalary();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary; //Mentioned here as totalSalary: Salary + Raise.
        assertEquals(1050, newSalary);
    }

    @Test
    @DisplayName("Total Salary Test")
    void totalSalary() {
        Employee firstEmployee = new Employee("Halil",2000.0,41,2000);

        firstEmployee.raiseSalary();
        firstEmployee.bonus();
        firstEmployee.tax();
        firstEmployee.totalSalary();

        double newSalary = firstEmployee.totalSalary;
        assertEquals(2270,newSalary);
    }


}