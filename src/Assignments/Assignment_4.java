package Assignments;

import java.util.Scanner;

public class Assignment_4 {
    //Task 3- Write a program that prints the multiplication table of the user-provided number. please use while loop

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        int start = 1;
        while (start < 11) {
            System.out.println(start + "*" + number + " = " + (start * number));
            start++;
        }

    }
}
