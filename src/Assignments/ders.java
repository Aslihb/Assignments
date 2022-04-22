package Assignments;

public class ders {
    //from 2d array
    //create a java logic that will print odd and even numbers
    //count of even and odd
    //also it will print sum of odd numbers and sum of even numbers

    public static void main(String[] args) {
        int[][] number2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 25},
                {8, 9, 10, 11, 55}
        };

        int evencount=0;
        int oddcount=0;
        int sumeven=0;
        int sumodd=0;


        for( int [] eachcount : number2D){

            for (int eachelement : eachcount){

                if(eachelement %2 ==0){
                    System.out.println(eachelement + " is an even number");

                    evencount++;
                    sumeven+=eachelement;
                }else{
                    System.out.println( eachelement + " is an odd number");
                    oddcount++;
                    sumodd+=eachelement;
                }

            }
        }
        System.out.println("oddcount = " + oddcount);
        System.out.println("evencount = " + evencount);
        System.out.println("sumeven = " + sumeven);
        System.out.println("sumodd = " + sumodd);

    }
}
