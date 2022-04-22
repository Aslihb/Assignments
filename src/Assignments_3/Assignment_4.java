package Assignments_3;

public class Assignment_4 {
    // task4
    // Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
   // diff21(19) → 2
   // diff21(10) → 11
    // diff21(21) → 0
    // diff21(24) ->6

    public static void absolute(int y){
       int result=0;
        if(21==y){
            result=0;
        }else if(21<y){
            result=2*(y-21);
        }else{
            result=21-y;
        }
        System.out.println("Absolute difference : " + result);}
    public static void main(String[] args) {
        absolute(25);
        absolute(13);
    }}
