package Assignments_2;

import java.util.Arrays;

public class Assignment_3 {
    ////    (Array) Find Maximum
//    Write a program that can find the maximum number from a multi-dimension int Array
//
    public static void main(String[] args) {

        int [][] list2={{38,-90,0},{5,800,4}};
        int max=list2[0][0];


        for(int i=0; i< list2.length ; i++){
            for(int k=0 ; k< list2.length; k++){
                if(list2[i][k]>max){
                    max=list2[i][k];
                }
            }
        } System.out.println("max = " + max);



    }


}
