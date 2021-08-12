package exercise;/*Given an int array, return true if the array contains 2 twice, or 3 twice.
 The array will be length 0, 1, or 2.
 */

public class double23 {
//    Exercise.double23([2, 2]) → true
//    Exercise.double23([3, 3]) → true
//    Exercise.double23([2, 3]) → false

    public static void main(String[] args) {
        int[] do1 = {2,2};
        int[] do2 = {3,3};
        int[] do3 = {2,3};

        System.out.println(double23(do1));
        System.out.println(double23(do2));
        System.out.println(double23(do3));
    }
    public static boolean double23(int[] nums) {

        boolean result = false;
        if(nums.length>=2)
        {if((nums[0] == 2 && nums[1]==2) || (nums[0] == 3 && nums[1]==3)){
            result = true;}
        }else if(nums.length<=1) result = false;
        return result;}
}
