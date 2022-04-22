package Assignments_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6 {
    //create a java program that will ask for 5 string name to store in the array
//and print first and last letter from each string
//example
//input : berkan , firas ,merve ..
//output : bn , fs ,me
    public static void main(String[] args) {

        String[] list=new String[5];
        String letters="";
        System.out.println("Enter 5 name");
        for(int i=0 ; i<5 ; i++){

            Scanner input=new Scanner(System.in);
            String name=input.nextLine();
            list[i]=name;


            }for(int k=0 ; k< list.length ; k++){
                letters+=Character.toString(list[k].charAt(0))+Character.toString(list[k].charAt(list[k].length()-1))+",";


        }System.out.println(Arrays.toString(list));
        System.out.println(letters);


    }



    }

