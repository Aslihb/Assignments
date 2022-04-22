package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[5];
        int[] list2 = {1, 2, 3, 4, 5};
        int[] list3 = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            System.out.println("Please enter number");
            list1[i] = input.nextInt();
            list3[list1.length + i ] =list2[i];

        }
        System.out.println(Arrays.toString(list1));

        for (int i = 0; i <list2.length ; i++) {
            list3[i] =list1[i];
        }
        System.out.println(Arrays.toString(list3));
    }
}
