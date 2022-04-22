package Assignments;

public class Assignment_1 {
    public static void main(String[] args) {

        for(int odd=0 ; odd<=100 ; odd++){
            if(odd%2 != 0 && odd%3 == 0 && odd%5 == 0){
                System.out.println("Odd and divisible by 3&5 : ".concat(""+odd));
            }
        }

        System.out.println("------------");

        for (int even=0 ; even<=100 ; even++){
            if(even%2 == 0 && even%3==0 && even%5 == 0){
                System.out.println("Even and divisible by 3&5 : ".concat(""+even));
            }
        }
    }
}
