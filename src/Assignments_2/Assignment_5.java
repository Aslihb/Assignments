package Assignments_2;

public class Assignment_5 {
    //write a program that can return the largest string of text from an array
//ex     String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex     String[] names = {"hello", "world", "java", "pyton", "JS" "sevgin", "renastechschool"};
//output : JS

    public static void main(String[] args) {
        String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};

        String largest=names[0];
        String shortest=names[0];

        for(int i=0 ; i<names.length ; i++){
            if(names[i].length()>largest.length()){
                largest=names[i];
            }
            if (names[i].length()<shortest.length()) {
                shortest=names[i];

            }
        }System.out.println("Smalest one is "+ shortest);
        System.out.println("Largest one is " + largest);





    }
}
