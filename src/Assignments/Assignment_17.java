package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_17 {
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.

    public static void main(String[] args) {


        int [] list2=new int[5];
        int [] list1=new int[5];

        System.out.println("Enter 5 numbers");
        Scanner input=new Scanner(System.in);


        for(int i=0 ; i<list1.length ; i++){
            list1[i]=input.nextInt();
            list2[i]=list1[i];

        }
        System.out.println(Arrays.toString(list2));


    }

}
