package StudyHall_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c1 {
    public static void main(String[] args) {
        int [] sorting={2,5,-10,-300,500,260};
        System.out.println(Arrays.toString(sorting));

        Arrays.sort(sorting);

        System.out.println(Arrays.toString(sorting));

        int maxNumber= sorting[sorting.length-1];
        int minNumber= sorting[0];

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

        //get only min and max number to the list1

        int[] list1=new int[2];
        list1[0]=minNumber;
        list1[1]=maxNumber;
        System.out.println(Arrays.toString(list1));



            }



            }




