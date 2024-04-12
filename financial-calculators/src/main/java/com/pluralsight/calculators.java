package com.pluralsight;

import java.util.Scanner;

public class calculators {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println(" which calculator do you want to use ?");
        System.out.println( "Input 1 for Mortgage calculator");
        System.out.println(" Input 2 for future value calculator ");
        System.out.println(" Input 3 for Present value calculator ");
         double input= scan.nextDouble();

         if (input==1){
             mortgagecalculator();
         }
         else if(input==2){futurevalue();}
         else if (input==3){presentvalue();}
         else {
             System.out.println("invalid input");}
    }
    public static void mortgagecalculator(){
        Scanner scan=new Scanner(System.in);
        //Input principal
        System.out.println("what is your principal?");
        double principal=scan.nextDouble();
        // Input Interest rate
        System.out.println("what is your interest rate?");
        double interestRate =scan.nextDouble();
        //input loan length in years
        System.out.println("what is the loan length in years ");
        double loanLength =scan.nextDouble();
        // calculate monthly interest rate
        double monthlyInterestRate= interestRate/1200;
        //calculate totalmonth
        double totalMonth=loanLength*12;
        // calculate monthly payment
        double monthlyPayment=(principal*monthlyInterestRate*Math.pow(1+monthlyInterestRate,totalMonth))/(Math.pow(1+monthlyInterestRate,totalMonth)-1);
        // calculate total interset paid
        double totalInterest= monthlyPayment*totalMonth-principal;

        // display result
        System.out.println("Your monthly payment is "+ String.format ("%.2f",monthlyPayment));
        System.out.println("your total interest paid is "+ String.format ("%.2f",totalInterest));

    }
    public static void futurevalue(){
        Scanner scan=new Scanner(System.in);
        System.out.print("what is your deposit ? ");
        double deposit = scan.nextDouble();

        //  Input interest rate.
        System.out.print("what is the interest rate?");
        double interestRate = scan.nextDouble();

        // Tell user to enter the length in years.
        System.out.print("Input the length in years: ");
        int totalLength = scan.nextInt();

        // Calculate the monthly interest rate.
        double monthlyInterestRate = interestRate / 1200;

        // Convert years to months.
        int totalMonths = totalLength * 12;

        // Calculate future value.
        double futureValue = deposit * Math.pow(1 + monthlyInterestRate, totalMonths);

        // Calcuate total interest.
        double totalInterest = futureValue - deposit;

        // Print out the information.

        System.out.println("The Future Value is " + String.format ("%.2f",futureValue));
        System.out.println("the Total Interest Earned is " + String.format ("%.2f",totalInterest));
    }
    public static void presentvalue (){
        Scanner scan=new Scanner(System.in);
        // ask the user for monthly payout
        System.out.println("what is your monthly payout?");
        double monthlyPayout= scan.nextDouble();
        // ask for expected interest rate
        System.out.println("what is the expected interest rate? ");
        double expectedInterest=scan.nextDouble();
        // ask the user for years to payout
        System.out.println("please enter the years to payout.");
        double yearsToPayout=  scan.nextDouble();

        //calculate monthly interest rate

        double monthlyInterestrate=expectedInterest/1200;

        // convert to totalmonth
        double totalMonth= yearsToPayout*12;
        // calculate present value
        double presentValue= monthlyPayout*(1-Math.pow(1+ monthlyInterestrate,-totalMonth))/monthlyInterestrate;

        System.out.println("The present value is"+ String.format ("%.2f",presentValue));



    }


}
