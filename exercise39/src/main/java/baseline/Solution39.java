/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Solution39 {

    // instance variables
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    // constructor
    public Solution39(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    // getters for the print statement and setters for test cases
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }


public static class LastNameSort implements Comparator<Solution39> {
    @Override
    public int compare(Solution39 o1, Solution39 o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

    public static void main(String[] args) {
        //ignore the ugly spacing here, it's to try and line up the formatting as much as possible
        List<Solution39> employeeList = new ArrayList<>();
        employeeList.add(new Solution39("John", "Johnson       ", "Manager         ", "2016-12-31"));
        employeeList.add(new Solution39("Tou", "Xiong          ", "Software Eng.   ", "2016-10-05"));
        employeeList.add(new Solution39("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Solution39("Jake", "Jacobson      ", "Programmer      ", ""));
        employeeList.add(new Solution39("Jacquelyn", "Jackson  ", "D.B.A           ", ""));
        employeeList.add(new Solution39("Sally", "Webber       ", "Web Developer   ", "2015-12-18"));

        employeeList.sort(new LastNameSort());

        System.out.println("Name" + "                 |  " + "Position            |"+"Separation Date            |");
        System.out.println("---------------------|----------------------|---------------------------|");

        for (Solution39 emp : employeeList) {
            System.out.format("%2s %7s  |    %7s  |    %7s", emp.getFirstName(), emp.getLastName(), emp.getPosition(),emp.getSeparationDate());
            System.out.println();
        }

    }
}
