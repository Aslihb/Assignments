package Assignments;

import java.util.Arrays;

public class Assignment_23 {
    //write a program that can return the average number from an array of integers
//      ex:
//        [20, 25, 15]
//        average: 20
//write a program that can return the sum of number from an array of integers
//      ex:
//        [20, 25, 15]
//        sum: 60
//write a program that can return the min number from an array of integers
//      ex:
//        [20, 25, 15]
//        min: 15
//write a program that can return the max number from an array of integers
//      ex:
//        [20, 25, 15]
//        max: 25

    public static void main(String[] args) {

        int[] numbers = {20, 25, 15};

        int sumOfNumbers = 0;
        int average=0;
        int minNumber=numbers[0];
        int maxNumber=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers+=numbers[i];
            average=sumOfNumbers/3;

            if(numbers[i]>maxNumber){
                maxNumber=numbers[i];
            }
            else if(numbers[i]<minNumber){
                minNumber=numbers[i];

            }
        }

        System.out.println("sumOfNumbers = " + sumOfNumbers);
        System.out.println("average = " + average);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

    }
}