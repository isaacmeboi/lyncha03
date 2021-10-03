package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    //storing possible responses in array
    String[] responses = {"Yes","No","Maybe","Ask again later"};
    //create random object
    Random random = new Random();

    public void question(){

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();
    }
    public void ball(){

        //chooses any index >= 0 and less than responses.length
        int randomResponseIndex = random.nextInt(responses.length);
        //get random index from array
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
    public static void main(String[] args) {
        Solution33 ca = new Solution33();
        ca.question();
        ca.ball();

}

}
