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
    double netSalary;

    Employee(String name, double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


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

    //Tax Calculation
    void tax(){
        if(this.salary>0 && this.salary+this.bonus<=1000){
            this.tax = 0;
        }else if(this.salary+this.bonus>1000){
            this.tax =(this.salary+this.bonus)*0.03;
        }
        System.out.println("Tax: "+new DecimalFormat("##.##").format(this.tax)+" TL");
    }



    //Net Salary Calculation
    void netSalary(){  // That will calculate the net salary taking into account bonuses and taxes as a 5. methods.
        this.netSalary = ((this.salary+this.bonus)-this.tax);
        System.out.println("Net Salary: "+this.netSalary);

    }



    //Total Salary Calculation
    void totalSalary(){
        this.totalSalary  = ((this.salary+this.bonus+this.raiseSalary) - this.tax);
        System.out.println("Total Salary: "+new DecimalFormat("##.##").format(this.totalSalary)+" TL");
    }

    //Raise Calculation
    void raiseSalary(){
        if(hireYear>2021 || hireYear<0){
            System.out.println("Salary raise could not be calculated. Please check the year of hiring.");
        }else {
            if((2021-this.hireYear)>19 ){
                this.raiseSalary = (this.netSalary*0.15);
            }else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
                this.raiseSalary = (this.netSalary*0.10);
            }else{
                this.raiseSalary = (this.netSalary*0.05);
            }

            System.out.println("Salary Raise: "+new DecimalFormat("##.##").format(this.raiseSalary) +" TL");
        }

    }

    public String toString(){
        return  "Worker: "+this.name +"\n"+
                "Salary: "+this.salary+" TL\n"+
                "Weekly Work Hours: "+this.workHours+" Hours"+"\n"+
                "Start Year: "+this.hireYear;

    }

}
