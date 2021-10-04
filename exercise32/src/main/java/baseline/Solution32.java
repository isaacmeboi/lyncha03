/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.util.Scanner;

public class Solution32 {
    int secretNum;
    int guess;
    int total=0;
    int key;
    public void loop() {
        Scanner sc = new Scanner(System.in);

        secretNum = (int) (Math.random() * 999 + 1);
        total = 0;
        boolean bError = true;

        System.out.println("Let's play Guess the Number!");

        //loops for valid input
        do {
            try {
                System.out.print("Enter the difficulty level(1, 2, or  3): ");
                key = Integer.parseInt(sc.next());
                bError = false;
            }
            catch (Exception e) {
                System.out.println("Please input an integer.");
                sc.reset();
            }
        } while (bError);

        while (true) {

            //check for difficulty level
            if (key == 1) //get random number
                secretNum = (int) (Math.random() * 10 + 1);
            else if (key == 2) //get random number
                secretNum = (int) (Math.random() * 100 + 1);
            else  //get random number
                secretNum = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");

            do {
                //loop to validate integer input
                do {
                    try {
                        guess = Integer.parseInt(sc.next());
                        bError = false;
                    }
                    catch (Exception e) {
                        System.out.println("Please input an integer.");
                        sc.reset();
                    }
                } while (bError);

                total++; //count the guess
                //if else for too high/low or correct guess
                if (guess == secretNum) {
                    System.out.println("You got it in " + total + "  guesses!");
                } else if (guess < secretNum)
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNum)
                    System.out.println("Too high. Guess again: ");

            } while (guess != secretNum);
            //if player wants to continue playing
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s = sc.next().charAt(0);
            if (s == 'N' || s == 'n')
                break;
        }
    }
    public static void main(String[] args) {
        Solution32 ca = new Solution32();
        //keeps everything out of main
        ca.loop();
        }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public void setKey(int key) {
        this.key = key;
    }
}


