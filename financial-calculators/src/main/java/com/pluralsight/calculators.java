package com.pluralsight;

import java.util.Scanner;

public class calculators {
    public static void main(String[] args) {

        System.out.println(" which calculator do you want to use ?");

    }
    public static void mortgagecalculator(){
        Scanner scan=new Scanner(System.in);
        //Input principal
        System.out.println("what is your principal?");
        double principal=scan.nextDouble();
        // Input Interest rate
        System.out.println("what is your interest rate?");
        double interestrate =scan.nextDouble();
        //input loan length in years
        System.out.println("what is the loan length in years ");
        double loanlength =scan.nextDouble();
        // calculate monthly interest rate
        double monthlyinterestrate= interestrate/1200;
        //calculate totalmonth
        double totalmonth=loanlength*12;
        // calculate monthly payment
        double monthlypayment=(principal*monthlyinterestrate*Math.pow(1+monthlyinterestrate,totalmonth))/(Math.pow(1+monthlyinterestrate,totalmonth)-1);
        // calculate total interset paid
        double totalinterest= monthlypayment*totalmonth-principal;

        // display result
        System.out.println("Your monthly payment is "+ monthlypayment);
        System.out.println("your total interest paid is "+ totalinterest);

    }
    public static void futurevalue(){
        Scanner scan=new Scanner(System.in);
        System.out.print("what is your deposit ? ");
        double deposit = scan.nextDouble();

        //  Input interest rate.
        System.out.print("what is the interest rate?");
        double interestrate = scan.nextDouble();

        // Tell user to enter the length in years.
        System.out.print("Input the length in years: ");
        int totallength = scan.nextInt();

        // Calculate the monthly interest rate.
        double monthlyInterestRate = interestrate / 1200;

        // Convert years to months.
        int totalMonths = totallength * 12;

        // Calculate future value.
        double futureValue = deposit * Math.pow(1 + monthlyInterestRate, totalMonths);

        // Calcuate total interest.
        double totalInterest = futureValue - deposit;

        // Print out the information.

        System.out.println("The Future Value is " + futureValue);
        System.out.println("the Total Interest Earned is" + totalInterest);
    }
    public static void presentvalue (){
        Scanner scan=new Scanner(System.in);
        // ask the user for monthly payout
        System.out.println("what is your monthly payout?");
        double monthlypayout= scan.nextDouble();
        // ask for expected interest rate
        System.out.println("what is the expected interest rate? ");
        double expectedInterest=scan.nextDouble();
        // ask the user for years to payout
        System.out.println("please enter the years to payout.");
        double yearstopayout=  scan.nextDouble();

        //calculate monthly interest rate

        double monthlyinterestrate=expectedInterest/1200;

        // convert to totalmonth
        double totalmonth= yearstopayout*12;
        // calculate present value
        double presentvalue= monthlypayout*(1-Math.pow(1+ monthlyinterestrate,-totalmonth))/monthlyinterestrate;

        System.out.println("The present value is"+ presentvalue);



    }


}
