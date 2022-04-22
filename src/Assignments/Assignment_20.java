package Assignments;

import java.util.Arrays;

public class Assignment_20 {
    //Write a Java program to reverse the element of an integer array.
    public static void main(String[] args) {

        int [] numbers={10,20,30,40,50};
        int [] reverse= new int[numbers.length];
        int lastIndex=numbers.length-1;

        int temp=0;
        for(int i=lastIndex ; i>=0 ; i--){
            reverse[temp]=numbers[i];
            temp++;

        }
        System.out.println(Arrays.toString(reverse));




    }
}
