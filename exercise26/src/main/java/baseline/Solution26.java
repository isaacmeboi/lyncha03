package baseline;

import java.util.Scanner;

public class Solution26 {
    //does the math
    public static int calculateMonthsUntilPaidOff(double b, double apr, double p) {

        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double b;
        double apr;
        double p;

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
}

