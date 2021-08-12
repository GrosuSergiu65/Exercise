package exercise;

/*
Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value.
 Return the changed array.

Exercise.maxEnd3([1, 2, 3]) → [3, 3, 3]
Exercise.maxEnd3([11, 5, 9]) → [11, 11, 11]
Exercise.maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class maxEnd3 {


    public static void main(String[] args) {
        int [] max1 = {1,2,3};
        int [] max2= {11, 5, 9};
        int [] max3 = {2, 11, 3};

        System.out.println(maxEnd3(max1));
        System.out.println(maxEnd3(max2));
        System.out.println(maxEnd3(max3));

    }
    public static int[] maxEnd3 (int[] nums){
        int[] result ;
                if(nums[0]> nums[2]){
                    result = new int[]{nums[0], nums[0], nums[0]};
                } else{
                    result = new int[]{nums[2], nums[2], nums[2]};
                }

    return result;}
}
