package Assignments_3;

public class Assignment_2 {
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    //monkeyTrouble(true, true) → true
    //monkeyTrouble(false, false) → true
    //monkeyTrouble(true, false) → false

    public static void main(String[] args) {
        monkeys(true,true);
        monkeys(false,false);
        monkeys(false,true);
        monkeys(true,false);
    }
    public static void monkeys(boolean m1 , boolean m2){
        boolean result=true;
        if(m1==true && m2==true){
            result=true;
        }else if(m1==false && m2==false){
            result=true;
        }else{
            result=false;
        }
        System.out.println("Trouble " + result);
    }
}
