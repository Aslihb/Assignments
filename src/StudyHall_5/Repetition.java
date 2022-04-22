package StudyHall_5;

import java.util.Arrays;

public class Repetition {
    public static void main(String[] args) {
        String [] names= {"denver", "texas", "orlando", "Toronto", "jeniffer", "sevgin", "renastechschool"};

        int largest=names[0].length();

        for(int i=0 ; i<names.length ; i++){
            if(names[i].length()>largest){
                largest=i;
            }
            System.out.println(names[largest]);
        }


    }

}
