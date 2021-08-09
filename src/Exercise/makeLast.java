package Exercise;

/*
Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 */
public class makeLast {
//    Exercise.makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    Exercise.makeLast([1, 2]) → [0, 0, 0, 2]
//    Exercise.makeLast([3]) → [0, 3]

    public static void main(String[] args) {
       int[] ma1 = {4,5,6};
        int[] ma2 = {1,2};
        int[] ma3 = {3};



        System.out.println(makeLast(ma1));
        System.out.println(makeLast(ma2));
        System.out.println(makeLast(ma3));

    }
    public static int[] makeLast(int [] nums){
   int [] result = new int[nums.length*2];
   result[result.length-1] = nums[nums.length-1];
 return result;   }
}
