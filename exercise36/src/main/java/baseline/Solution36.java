/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        String entry;

        //do-while loop for number entry
        do {
            System.out.println("Enter a number: ");
            entry = input.next();//get the entry

            if(!entry.equals("done")) {
                try {//ensures its an int
                    int num = Integer.parseInt(entry);
                    numbers.add(num);//add if passes
                }catch(NumberFormatException nfe) {
                    //do not add if it doesn't
                }
            }
        }while(!entry.equals("done"));//loop as long as user does not enter "done"

        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("The average is "+average(numbers));
        System.out.println("The minimum is "+min(numbers));
        System.out.println("The maximum is "+max(numbers));
        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));


    }

    //calculate average
    public static double average(List<Integer> numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        return (double)(total)/numbers.size();
    }


    //calculate maximum
    public static int max(List<Integer> numbers) {
        int max= numbers.get(0);

        for(int num: numbers) {
            if(num > max)
                max = num;
        }

        return max;
    }

    //calculate minimum

    public static int min(List<Integer> numbers) {
        int min= numbers.get(0);

        for(int num: numbers) {
            if(num < min)
                min = num;
        }

        return min;
    }

    //calculates standard deviation
    public static double std(List<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDev = Math.sqrt(sum/numbers.size());

        return stdDev;
    }

}

