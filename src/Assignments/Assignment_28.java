package Assignments;

import java.util.Arrays;

public class Assignment_28 {
    //Q17 Write a program to check whether two given Arrays are equal,
    public static void main(String[] args) {

        int [] list1={20,56,75,48,62,22};
        int [] list2={20,50,75,48,62,29};

        boolean b1= Arrays.equals(list1,list2);
        System.out.println(b1);

    }
}
