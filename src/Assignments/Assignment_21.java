package Assignments;

import java.util.Arrays;

public class Assignment_21 {
    public static void main(String[] args) {
        //Write a Java program to find the largest and smallest element of an array.

        int [] laSm={300,-350,500,-600,-75};

        int maxNumber=0;
        int minNumber=0;

        for(int k=0 ; k<=laSm.length-1 ; k++){

            if(laSm[k]> maxNumber){
                maxNumber=laSm[k];
            } else if(laSm[k]<minNumber){
                minNumber=laSm[k];

            }
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);


    }
}
