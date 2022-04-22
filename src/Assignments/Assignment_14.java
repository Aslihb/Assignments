package Assignments;

public class Assignment_14 {
    public static void main(String[] args) {
        /**
         Write a Java program to test if a given string contains the specified sequence of char values.
        Sample Output:
        Original String: PHP Exercises and Python Exercises
        Specified sequence of char values: and
        true
         */

        String str="PHP Exercises and Python Exercises";
        System.out.println(str.contains("and"));
        System.out.println(str.contains("P"));
        System.out.println(str.contains("Ex"));
        System.out.println(str.contains("ex"));

    }
}
