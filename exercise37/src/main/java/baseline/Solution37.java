/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.util.*;


public class Solution37 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //enter password length
        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(in.nextLine());
        // enter # of special characters
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(in.nextLine());
        // enter # of numbers
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(in.nextLine());

        // call generatePassword
        // display that password
        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }

    // generate sand returns random password
    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        // loop for required number of special characters
        for(int i=0; i<special; i++){
            // finds rand special character and adds it
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        // a loop for required numbers
        for(int i=0; i<nums; i++){
            // finds rand number and adds it
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        // loop for remaining password length
        for(int i=chars.size()-1; i<length; i++){
            // finds rand letter and adds it
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        // shuffles elements
        Collections.shuffle(chars);
        StringBuilder password = new StringBuilder();
        // loop to add all elements to the result
        for(Character s : chars)
        {
            password.append(s);
        }

        // return result
        return password.toString();
    }
}
