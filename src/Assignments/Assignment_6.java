package Assignments;

public class Assignment_6 {
    public static void main(String[] args) {

        int[] numArray={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};

        System.out.println("Length = " + numArray.length);

        System.out.println("tenth element of the array is " + numArray[9]);
        numArray[4]=35;
        numArray[8]=numArray[5]+numArray[12];
        System.out.println("ninth element of the array is "+numArray[8]);


    }
}
