package Assignments;

import java.sql.Array;
import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) {

        int [] Array= new int[10];

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        int sumOfNumbers=0;
        for (int i = 0; i < 10 ; i++) {

            int numbers=input.nextInt();
            sumOfNumbers+=numbers;

        }
        System.out.println("sumOfNumbers = " + sumOfNumbers);

    }
}
