package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_22 {
    public static void main(String[] args) {

        double [] list=new double[5];

        Scanner input=new Scanner(System.in);

        for (int i=0 ; i<list.length ; i++){
            System.out.println("Enter salary");
            list[i]= input.nextDouble();

        }
        System.out.println(Arrays.toString(list));
    }
}
