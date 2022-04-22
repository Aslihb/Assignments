package Assignments_2;

import java.util.Arrays;
import java.util.Locale;

public class Assignment_2 {

//    Write a program that checks if a string is build-out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:
public static void main(String[] args) {

    String list1="cde";
    String list2="dec";
    String list3="bng";
    char [] x= list1.toCharArray();
    char [] y=list2.toCharArray();
    char [] z=list3.toCharArray();

    Arrays.sort(x);
    Arrays.sort(y);
    Arrays.sort(z);
    boolean a=Arrays.equals(x,y);
    boolean b=Arrays.equals(x,z);

    System.out.println(a);
    System.out.println(b);

}
}

