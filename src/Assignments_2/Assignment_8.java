package Assignments_2;

 public class Assignment_8 {
//// write a method that will take 3 parameters
//  // 2 numbers and one operator
//  // it will do the calculation
//
//  //ex : 200 100 +
//  //result 300
//
//  //ex 15 3 *
//  //result 45
public static void main(String[] args) {

    calculation(10,20,'+');
    calculation(20,53,'%');
}
    public static void calculation( int x,int y, char operator){

        if(operator=='*'){
            System.out.println(x*y);
        }else if(operator=='/'){
            System.out.println(x/y);
        }else if (operator=='+'){
            System.out.println(x+y);
        }else if(operator=='-'){
            System.out.println(x-y);
        }else{
            System.out.println("Invalid operator");
        }}}
