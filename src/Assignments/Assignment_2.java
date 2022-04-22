package Assignments;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number :");
        int number= input.nextInt();
        int factorial=1;

        for(int i=1; i<=number ; i++ ){
            factorial*=i;

        }
        System.out.println(number+"! = " + factorial);
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter your second number");
        int number2= input.nextInt();
        int factorial2=1;
        int f=1;

        while(f<=number2){
            factorial2*=f;
            f++;
        }
        System.out.println(factorial2);
        }

    }

