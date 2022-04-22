package Assignments;

import java.util.Arrays;

public class Assignment_30 {
    ////Q25 create a condition that will reverse given sentence
//   //ex: Java is fun
//   //output should be fun is java
////create a condition that will reverse given string
//   //ex: Java is fun
//   //output should be nuf si avaJ
    public static void main(String[] args) {

        String ex="Java is fun";

        String [] splt=ex.split(" ");
        String[] splt2=ex.split("");

        System.out.println(Arrays.toString(splt));
        System.out.println(Arrays.toString(splt2));
        String reverse="";
        String reverse2="";

        for(int i= splt.length-1 ; i>=0 ; i-- ){
            reverse+=splt[i]+" ";
        }
        System.out.println("reverse = " + reverse);

        for(int i= splt2.length-1 ; i>=0 ; i--){
            reverse2+=splt2[i]+" ";
        }
        System.out.println("reverse2 = " + reverse2);


    }
}
