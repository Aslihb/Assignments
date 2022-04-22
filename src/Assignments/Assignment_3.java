package Assignments;

import java.util.Scanner;

public class Assignment_3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Set sum limit");
        System.out.println(oddcount(input.nextInt()));

    }
    static int oddcount(int limitn) {

        int sum=0;
        for(int i=0 ; i<=limitn ; i++){
            if(i%2 !=0){
                sum+=i;
            }
        }


        return sum;
    }
}
