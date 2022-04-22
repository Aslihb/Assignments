package Assignments_2;

import java.util.Scanner;

public class Assignment_4 {
    //create a java program that will check days string and depends on number you passed
//you should be able to see day name
//example : 2 tue
//3 :wed
//numbers should be between 1 to 7 (included)
//if numbers are not between 1 to 7 print invalid number
//and give user 3 attempt if it is still not between 1 to 7 then stop whole system
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int incorrect = 0;
        int chance = 2;

        while (incorrect < 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number between 1-7 to see days of the week");
            int attempt = input.nextInt();
            if (attempt >= 1 && attempt <= 7) {
                System.out.println(attempt + " = " + days[attempt - 1]);

            } else  {
                System.out.println("invalid number left " + chance + " chance");
                chance--;
                incorrect++;
            }
            }

        }
    }





