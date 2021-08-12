package exercise;/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
 Both arrays will be length 1 or more.
 */

//        Exercise.commonEnd([1, 2, 3], [7, 3]) → true
//        Exercise.commonEnd([1, 2, 3], [7, 3, 2]) → false
//        Exercise.commonEnd([1, 2, 3], [1, 3]) → true
class commonEnd{
    public static void main(String[] args) {
        int [] int1 = {1,2,3};
        int [] int12 = {7,3};
        System.out.println(commonEnd(int1, int12));
        System.out.println();
        System.out.println();
    }
    public static boolean commonEnd(int[] a, int[] b){
        boolean good = false;
        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
            good = true;
        }return good;
}
        }
