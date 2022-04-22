package Assignments;

public class Assignment_27 {
    //Create a java program that will print how many times java is written in the given String array=.
    // String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}
    public static void main(String[] args) {
        String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};
        int countjava=0;
        for(int i=0 ; i< name.length ; i++){
            if(name[i].equalsIgnoreCase("java")){
                countjava++;
            }
        }
        System.out.println(countjava+ " times ");

    }
}
