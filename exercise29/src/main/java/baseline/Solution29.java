/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;
import java.util.Scanner;

public class Solution29 {
    int r;
    public int math(){
        r = 72/r;
        return r;
    }
    public int loop() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            try {
                System.out.print("What is the rate of return? ");
                r = Integer.parseInt(sc.next());
                System.out.println("It will take " + math() + " years to double your initial investment.");
                flag = true; //if exception not raised set flag true
            } catch (NumberFormatException e) //catch invalid number
            {
                System.out.println("Sorry. That's not a valid input");
            } catch (ArithmeticException e) //catch division error
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if (flag)
            {
                break;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Solution29 ca = new Solution29();
        ca.loop();

        }

    public void setR(int r) {
        this.r = r;
    }
}

