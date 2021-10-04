/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

import java.util.*;

public class Solution38 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        // split the input string by space to String array
        String[] list = data.split(" ");

        // call evenList to print only evens
        Integer[] evenList = filterEvenNumbers(list);

        // display the filtered evens
        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    // takes array of string integers as input parameter and returns even numbers
    public static Integer[] filterEvenNumbers(String[] list) {

        ArrayList<Integer> newList = new ArrayList<>();

        // loop to iterate over array
        for (String s : list) {

            // convert int
            int num = Integer.parseInt(s);

            // check if number is even
            if (num % 2 == 0) {

                // add number to the list
                newList.add(num);
            }
        }

        // now, convert the array list to integer array
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        // return Integer array
        return arr;
    }
}
