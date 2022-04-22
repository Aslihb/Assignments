package Assignments;

import java.util.Arrays;

public class Assignment_19 {
    public static void main(String[] args) {
        int [] list={3,-100,9,5,99,-300};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        String [] sentence={"HEllo", "world", "java", "is", "here"} ;

        for (String eachsentence : sentence ){
            System.out.println(eachsentence);
        }

        System.out.println("+++++++++++++++");
        String sentence2="HEllo world java is here" ;
        String [] st2=sentence2.split(" ");
        for(String st:st2){
            System.out.println(st);
        }


    }
}
