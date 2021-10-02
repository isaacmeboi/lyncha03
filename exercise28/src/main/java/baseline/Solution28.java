package baseline;
import java.util.Scanner;

public class Solution28 {
    //keeps everything out of main basically
    public void math() {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }


    public static void main(String[] args) {
    Solution28 ca = new Solution28();
    ca.math();
}
}
