/* Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

 */
public class rotateLeft3 {
    public static void main(String[] args) {
        int [] rot1 ={1,2,3};
        int [] rot2 ={5,11,9};
        int [] rpt3 ={7,0,0};

        System.out.println(rotateLeft3(rot1));
        System.out.println(rotateLeft3(rot2));
        System.out.println(rotateLeft3(rpt3));
    }
    public static int[] rotateLeft3(int [] nums){
        int[] result = new int[3];
        result[0] = nums[1];
        result[1] = nums[2];
        result[2] = nums[0];
    return  result;}
}
