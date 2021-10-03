package baseline;

import java.util.Scanner;

public class Solution31 {
    int restingHR;
    int age;
    double intensity = 55;
    double Target;
    public void formatting(){

        Scanner sc=new Scanner(System.in);

        boolean bError = true;
        //loops for valid input
        do {
            try {
                System.out.println("Enter heart rate and age: ");
                restingHR = Integer.parseInt(sc.next());
                age = Integer.parseInt(sc.next());

                bError = false;
            }
            catch (Exception e) {
                System.out.println("Please input an integer.");
                sc.reset();
            }
        } while (bError);

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");
    }
    public void math() {
        //increases intensity whilst doin da maf
        while (intensity < 96) {
            Target = Math.round(((220 - age) - restingHR) * (intensity/100) + restingHR);
            System.out.println(intensity + "% | " + Target + "bpm");
            intensity += 5;
        }
    }
    public static void main (String[] args)
    {
        Solution31 ca = new Solution31();
        ca.formatting();
        ca.math();

        }
    }

