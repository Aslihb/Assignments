package Assignments_3;

public class Assignment_3 {
    //task3
    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
            //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    public static void main(String[] args) {
        doubleSum(2,2);
        doubleSum(3,2);
        doubleSum(1,2);
    }

    public static void doubleSum(int x,int y){
        int result=0;
        if(x==y){
            result=2*(x+y);
        }else{
            result=x+y;
        }
        System.out.println(result);
    }
}
