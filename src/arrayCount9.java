/*
Given an array of ints, return the number of 9's in the array.
 */

import java.sql.Array;

public class arrayCount9 {
    public static void main(String[] args) {
        int[] ar = {1,2,9,3,4};
        int[] an = {1,2,3,4,9};
        int[] ab = {1,2,3};
        System.out.println(arrayCount9(ar));
        System.out.println(arrayCount9(an));
        System.out.println(arrayCount9(ab));
    }
    public static boolean arrayCount9(int[] nums) {
        int index = 0;
        boolean good = false;


    while (index <nums.length){
        if(nums[index] == 9){
    good = true;
        }
        index ++;
        if(index==4){break;}
}
    return good;
}
}
