package exercise;

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 */
public class middleWay {
    public static void main(String[] args) {
        int [] md1 = {1, 2, 3};
        int [] md2 = {4, 5, 6};
        System.out.println(middleWay(md1, md2));
    }
    public static int[] middleWay(int[] a, int[] b){

        return new int[]{a[1], b[1]};
    }
}
