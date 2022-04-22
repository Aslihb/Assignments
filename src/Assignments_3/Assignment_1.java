package Assignments_3;

public class Assignment_1 {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
   // sleepIn(false, false) → true
    //sleepIn(true, false) → false
   // sleepIn(false, true) → true

    public static void main(String[] args) {

        sleepIn(false,false);
        sleepIn(true,false);
        sleepIn(false,true);
        sleepIn(true,true);
    }
    public static void sleepIn(boolean weekday, boolean vac){
        boolean result=true;

        if(weekday!=true || vac==true){
            result=true;
        }else{
            result=false;
        }
        System.out.println(result);
    }}