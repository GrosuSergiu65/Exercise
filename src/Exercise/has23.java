package Exercise;

/*Given an int array length 2, return true if it contains a 2 or a 3.

Exercise.has23([2, 5]) → true
Exercise.has23([4, 3]) → true
Exercise.has23([4, 5]) → false


 */
public class has23 {
    public static void main(String[] args) {
        int[] ha1 = {2, 5};
        int[] ha2 = {4, 3};
        int[] ha3 = {4, 5};

        System.out.println(has23(ha1));
        System.out.println(has23(ha2));
        System.out.println(has23(ha3));
    }

    public static boolean has23(int[] nums) {
        boolean res = false;
        if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {
            res = true;
        }
        return res;

    }
}
