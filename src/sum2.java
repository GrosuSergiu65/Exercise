/* Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 */

//sum2([1, 2, 3]) → 3
//sum2([1, 1]) → 2
//sum2([1, 1, 1, 1]) → 2

public class sum2 {
    public static void main(String[] args) {
        int[] su1 = {1, 2, 3};
        int[] su2 = {1, 1};
        int[] su3= {1, 1, 1, 1};
        System.out.println(sum2(su1));
        System.out.println(sum2(su2));
        System.out.println(sum2(su3));
    }
    public static int sum2(int[] nums){
        int result;
        if(nums.length>=2){
            result = nums[0]+nums[1];
        } else if (nums.length == 1){
            result = nums[0];}
        else {result =0;}
    return result;}
}
