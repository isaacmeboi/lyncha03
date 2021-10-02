package baseline;

import java.util.*;

public class Solution25 {

    public static void passwordValidator(String input)
    {
        // setting booleans false
        int n = input.length();
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean specialChar = false;
        //specifies which special characters are valid
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        //tests to see what the password has
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        //gives strength
        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("Strong");
        else if(hasLower || hasUpper && (n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }

    // Driver Code
    public static void main(String[] args)
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        input=sc.nextLine();
        passwordValidator(input);
    }
}
