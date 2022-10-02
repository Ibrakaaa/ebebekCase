package com.ebebek;

import java.text.DecimalFormat;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax ;
    double bonus ;
    double raiseSalary ;
    double totalSalary ;

    Employee(String name, double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    //Tax Calculation
    void tax(){
        if(this.salary<=1000 && this.salary>0){
            this.tax = 0;
        }else if(this.salary>1000){
            this.tax =this.salary*0.03;
        }
        System.out.println("Tax: "+new DecimalFormat("##.##").format(this.tax)+" TL");
    }

    //Bonus Calculation
    void bonus(){
        if(this.workHours>40){
            this.bonus = (this.workHours - 40)* 30;
            System.out.println("Bonus: "+this.bonus+" TL");
        }else{
            System.out.println("Bonus: Sorry you didn't earn bonus this week.You should work harder next week... ");

        }

    }

    //Raise Calculation

    void raiseSalary(){
        if(hireYear>2021 || hireYear<0){
            System.out.println("Salary raise could not be calculated. Please check the year of hiring.");
        }else {
            if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
                this.raiseSalary = this.salary*0.10;
            }else if((2021-this.hireYear)>19){
                this.raiseSalary = this.salary*0.15;
            }else{
                this.raiseSalary = this.salary*0.05;
            }

            System.out.println("Salary Raise: "+new DecimalFormat("##.##").format(this.raiseSalary) +" TL");
        }


    }

    //Total Salary Calculation
    void totalSalary(){
        this.totalSalary  = ((this.salary+this.bonus+this.raiseSalary) - this.tax);
        System.out.println("Total Salary: "+this.totalSalary+" TL");
    }

    void toPrint(){
        System.out.println("Worker: "+this.name +"\n"+
                "Salary: "+this.salary+" TL\n"+
                "Weekly Work Hours: "+this.workHours+" Hours"+"\n"+
                "Start Year: "+this.hireYear);
    }

}
