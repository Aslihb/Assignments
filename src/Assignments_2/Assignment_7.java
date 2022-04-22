package Assignments_2;

public class Assignment_7 {
    // create a java logic that will count letter a or A from given string
    //example
    //JavA
    //output should be 2
    public static void main(String[] args) {

        String str="JavA is fun if you can do it ";
        int count=0;
        int j=0;
        while(j<str.length()){
            if(str.charAt(j)=='a' || str.charAt(j)=='A'){
                count++;
            }
            j++;
        }
        System.out.println(count);

    }
}
