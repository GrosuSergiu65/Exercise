package Exercise;/*
Given an int array length 3,
if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

Exercise.fix23([1, 2, 3]) → [1, 2, 0]
Exercise.fix23([2, 3, 5]) → [2, 0, 5]
Exercise.fix23([1, 2, 1]) → [1, 2, 1]
 */


public class fix23 {


    public static void main(String[] args) {

        int[] fi1 = {1,2,3};
        int[] fi2 = {2, 3, 5};
        int[] fi13= {2,3,3};

        System.out.println(fix23(fi1));
        System.out.println(fix23(fi2));
        System.out.println(fix23(fi13));
    }
    public static int[] fix23 (int[] nums){

        for(int i = 0; i<nums.length-1; i++){
        if(nums.length>nums[i]){
            if(nums[i] ==2 && nums[i+1] == 3){
                nums[i+1] = 0;
            }
        }
        }
   return nums; }
}
