package Assignments;

public class Assignment_29 {
    //Q24 Write a program to sum all the values of a given Array in java?

    public static void main(String[] args) {

        int [] arr={100,99,98,97,96,95,94};

        int sumOfArr=0;
        int k=0;

        while(k<arr.length){
            sumOfArr+=arr[k];
            k++;

        }
        System.out.println("sumOfArr = " + sumOfArr);
    }
}
