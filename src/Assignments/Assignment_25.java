package Assignments;

public class Assignment_25 {
    //Create a java program that will print sum of the ODD numbers from given array.
    // int[] arr={2,3,5,6,56,0,53};
    public static void main(String[] args) {
        int[] arr={2,3,5,6,56,0,53};

        int sumOfOdd=0;

        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]%2 != 0 ) {
                sumOfOdd+=arr[i];
            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);

    }
}
