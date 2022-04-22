package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment_16 {
    // Ask user to enter 3 names by using scanner
// print last index of the names with the names
// Example : Renastech --> Last index is h for Renastech

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first name");
        String first=input.nextLine();
        System.out.println("Enter second name");
        String second=input.nextLine();
        System.out.println("Enter third name");
        String third=input.nextLine();


        System.out.println("Last index is " + first.charAt(first.length()-1) + " for " + first);
        System.out.println("Last index is " + second.charAt(second.length()-1) + " for " + second);
        System.out.println("Last index is " + third.charAt(third.length()-1) + " for " + third);


    }
}
