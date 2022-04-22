package Assignments_3;

import java.util.Arrays;

public class Assignment_7 {
    //// write a return method that can return minumum number from an int array
//    //expected output will be number
    public static int minNum(int[] arr) {
        Arrays.sort(arr);
        int min=arr[0];
        return min ;
    }

    public static void main(String[] args) {
         int[] list = {93, 85, 112, 7596, 471, 36};
        System.out.println("minNum(list) = " + minNum(list));
    }

}
