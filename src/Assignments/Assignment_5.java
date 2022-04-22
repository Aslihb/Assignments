package Assignments;

import java.util.Scanner;

public class Assignment_5 {
    /*Task 2: Write a program that checks if a String is a Palindrome.

            Example: input: Java , output: java is not a palindrome
    Example: input: kayak , output: kayak is a palindrome
    Example: input level, output : level is a palindrome
    */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter");
        String word=input.nextLine();

        int last=word.length()-1;
        String rev="";
        for (int i=last ; i>=0 ; i--) {
            rev += word.charAt(i);

            }if(word.equalsIgnoreCase(rev)){
                System.out.println(word + " is a palindrome");
            }else{
                System.out.println(word + " is not a palindrome");

        }
    }
}

