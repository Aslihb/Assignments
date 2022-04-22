package Assignments_2;

public class Assignment_10 {
    /*
Write a program that can print out the unique values from a String Array
      Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output: A
             C
 */
    public static void  UniqueValues(String [] sentence){

        String unique="";
        for(int i=0 ; i<sentence.length ; i++){
            int count=0;
            for(int k=0 ; k<sentence.length ; k++){
                if(sentence[i]==sentence[k]){
                    count++;
                }
            }if(count==1){
                unique+=sentence[i]+" ";
            }}
        System.out.println(unique);
    }
    public static void main(String[] args) {
        UniqueValues(new String[]{"A", "A", "B", "C", "C"});
        UniqueValues(new String[] {"A", "B", "B", "C"});
    }}


