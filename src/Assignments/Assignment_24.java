package Assignments;

public class Assignment_24 {
    //Create a java program that will print only numbers that divisible by 3,  int [] arr={23,25,26,32,42,51,99,2};
    public static void main(String[] args) {

        int [] arr={23,25,26,32,42,51,99,2};


        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]%3 == 0) {
                System.out.print(arr[i]+" ");
            }
            }
    }

}

