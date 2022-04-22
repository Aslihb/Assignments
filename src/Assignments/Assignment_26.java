package Assignments;

import java.util.Arrays;

public class Assignment_26 {
    // create a java program that will print numbers from biggest number to smallest number.
    // int [] arr={2,90,4,-99, 99,73};
    public static void main(String[] args) {
        int [] arr={2,90,4,-99, 99,73};
        int [] bigto=new int[arr.length];

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int in=0;

        for(int i=arr.length-1; i>=0 ; i--){
            bigto[in]=arr[i];
            in++;
        }
        System.out.println(Arrays.toString(bigto));

    }
}
