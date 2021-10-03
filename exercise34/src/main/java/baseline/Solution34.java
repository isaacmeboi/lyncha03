package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution34 {

    //Create an arrayList of employees
    ArrayList<String> employees = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

    public void print(){

        Scanner sc = new Scanner(System.in);
        printEmployees(employees);//print the employees

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = sc.nextLine();//get name to remove

        employees.remove(nameToRemove);//remove the employee

        System.out.println();
        printEmployees(employees);//reprint employees
    }
    public static void main(String[] args) {
        Solution34 ca = new Solution34();
        ca.print();

}
    public static void printEmployees(List<String> employees) {
        //prints number of employees there are
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}

