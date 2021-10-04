/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.util.Scanner;

public class Solution26 {

    double apr;
    double b;
    double p;
    //does the math
    public int calculateMonthsUntilPaidOff(double b, double apr, double p) {

        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }
    public void print(){


        Scanner scanner = new Scanner(System.in);


        System.out.print("What is your balance? ");
        b = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scanner.nextDouble();
        apr = apr / 100;

        System.out.print("What is the monthly payment you can make? ");
        p = scanner.nextDouble();

        int months = calculateMonthsUntilPaidOff(b, apr, p);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
    public static void main(String[] args) {
        Solution26 ca = new Solution26();
        ca.print();
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setP(double p) {
        this.p = p;
    }
}

