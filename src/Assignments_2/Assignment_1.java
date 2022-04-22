package Assignments_2;

public class Assignment_1 {
    //    (String) Find the unique
//    Write a program that can find the unique characters from the String
//
//    Ex:  String str= "AAABBBCCCDEF";  ==>  "DEF";

    public static void main(String[] args) {
        String str= "AAABBBCCCDEF";
        String unique="";

        for(int i=0 ; i<str.length() ; i++){
            int count=0;
            for(int k=0 ; k<str.length() ; k++)
            if(str.charAt(i)==str.charAt(k)){
                count++;
            }if(count==1){
                unique+=str.charAt(i);
            }
        }System.out.println(unique);

    }
}



