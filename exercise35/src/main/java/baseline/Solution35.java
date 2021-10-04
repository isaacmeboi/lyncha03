/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    String name;
    ArrayList<String> nameList = new ArrayList<>();//stores names

    public void addName(){
        Scanner input = new Scanner(System.in);

        //start a do-while loop to take name
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();
            //add the name only if it isn't an empty input
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        Solution35 ca = new Solution35();
        ca.pickWinner();
    }
    public String pickWinner(){
        //generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        //pick the winner at the randomIndex of nameList
        System.out.println("The winner is... "+nameList.get(randomIndex));
        return null;
    }

    public static void main(String[] args) {

        Solution35 ca = new Solution35();
        ca.addName();
    }

    public void setName(String name) {
        this.name = name;
    }
}