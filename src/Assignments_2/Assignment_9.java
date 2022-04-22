package Assignments_2;

import java.util.Arrays;

public class Assignment_9 {
    /*
write a program that can return the count of "java" and "javascript" anywhere in the sentence
 String sentence = "I like java and javascript,java is best, java and javascript,java ";
 */
    public static void main(String[] args) {

    CountGivenString("java");
    CountGivenString("javascript");

    }
    public static void CountGivenString(String word){
        String given="I like java and javascript,java is best, java and javascript,java ";

        int count=0;
        String replace=given.replace(","," ");
        String [] sentence=replace.split(" ");
        System.out.println(Arrays.toString(sentence));

        for(int i=0 ; i< sentence.length ; i++){
            if(sentence[i].equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);

    }
}
