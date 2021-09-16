package exercise.array;/*
Given an array of ints of even length,
return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.
 */

public class makeMiddle {
    public static void main(String[] args) {
        System.out.println(makeMiddle(new int[]{1, 2, 3, 4}));
        System.out.println(makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        System.out.println(makeMiddle(new int[]{1, 2}));

    }
    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};

    }
}
