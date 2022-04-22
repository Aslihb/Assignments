package Assignments_2;

public class Assignment_11 {
    //write a method that can identify if a string is palindrome
//      ex: palindrome("mom") ==> true
//        palindrome("hello") ==> false
    public static void main(String[] args) {
        Palindrome("kayak");
        Palindrome("hello");
    }
    public static void Palindrome(String x) {

        String reverse="";
        for (int i=x.length()-1 ;i>=0 ; i-- ) {
            reverse+=x.charAt(i);
        }if(x.equalsIgnoreCase(reverse)){
            System.out.println(x +" is palindrome");
        }else{
            System.out.println(x + " is not palindrome");
        }}}


