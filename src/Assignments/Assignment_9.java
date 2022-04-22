package Assignments;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment_9 {
    public static void main(String[] args) {
        String[] list1= new String[5];
        String[] list2={"a","b","c","d","e"};
        String [] list3= new String[10];

        for(int i=5 ; i<=9 ; i++) {
            list3[i]=list2[i];

            System.out.println(Arrays.toString(list3));
        }
        for (int i=0 ; i<=list1.length-1 ; i++){
            Scanner input=new Scanner(System.in);
            list1[i]= input.nextLine();

        }System.out.println(Arrays.toString(list1));









    }
}





