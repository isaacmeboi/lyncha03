/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Isaac Lynch
 */
package baseline;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution40 {
    //that wacky map variable
    static TreeMap<Integer, Solution40> employees = new TreeMap<>();

    //private instance variables
     String firstName;
     String lastName;
     String position;
     LocalDate separationDate;

    //constructor
    public Solution40(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }
    public Solution40(String firstName, String lastName, String position, LocalDate separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //getters for first and last
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    //this is primarily for the test cases tbh. toString method
    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lastName=" + lastName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }

//takes a given string and searches it against employees first or last name
    public static int search(String name){
        int count = 0;
        for(int k : employees.keySet()){
            if(employees.get(k).getFirstName().equalsIgnoreCase(name) || employees.get(k).getLastName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(k));
            }
        }
        return count;
    }
    public static void print() {
        Scanner sc = new Scanner(System.in);

        //wowza, this ugly bugger holds all the names of employees
        Solution40[] records = {
                new Solution40("John", "Johnson", "Manager", LocalDate.of(1985, 1, 1)),
                new Solution40("Tou", "Xiong", "Software Engineer", LocalDate.of(2016, 10, 5)),
                new Solution40("Michaela", "Michaelson", "District Manager", LocalDate.of(2015, 12, 19)),
                new Solution40("Jake", "Jacobson", "Programmer", null),
                new Solution40("Jacquelyn", "Jockson", "DBA", null),
                new Solution40("Sally", "Webber", "Web Developer", LocalDate.of(2015, 12, 18))
        };

        System.out.print("Enter a search string: ");
        String target = sc.nextLine();
        //this is the formatting for the spacing
        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s%n", "Name", "Position", "Seperation Date");
        System.out.printf("%-21s|%-22s|%-21s%n", "-".repeat(21), "-".repeat(22), "-".repeat(21));
        //finds the correct employees
        for (Solution40 rec : records) {
            String temp;
            if (rec.separationDate == null) temp = "";
            else temp = rec.separationDate.toString();
            if (rec.firstName.contains(target) || rec.lastName.contains(target))
                System.out.printf("%-20s | %-20s | %-20s%n", rec.firstName + " " +
                        rec.lastName, rec.position, temp);
        }
        sc.close();
    }
    public static void main(String[] args){
    print();
    }
    }
