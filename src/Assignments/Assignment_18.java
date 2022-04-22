package Assignments;

public class Assignment_18 {
    //Q15 Write a program to print elements of Array ?
    public static void main(String[] args) {

        String[] str={"Asli", "Gul", "Ozlem"};

        String list="";

        for(int i=0 ; i<str.length ; i++) {
            System.out.println(str[i]);
            list += str[i]+" ";
        }
        System.out.println(list);

    }
}
