package Assignments;

public class Assignment_12 {
    public static void main(String[] args) {
        String first="Stephen Edwin King";
        String second="Walter Winchell";
        String third="stephen edwin king";


        boolean b=first.equalsIgnoreCase(second);
        boolean c =first.equalsIgnoreCase(third);


        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
