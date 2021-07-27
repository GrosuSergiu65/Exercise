/*Given an array of ints length 3, return the sum of all the elements.

 */
public class sum3 {
    public static void main(String[] args) {
        int[] sum = {5, 11, 2};
        System.out.println(sum3(sum));
    }
    public static int sum3(int [] nums){
        int total = 0;
        for(int i = 0; i<nums.length; i++){
            total+=nums[i];
        }
    return total;}
}
