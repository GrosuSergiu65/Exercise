package exercise.boolean1;
//Given three ints, a b c, return true if two or more of them have the same rightmost digit.
//        The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
//
//        lastDigit(23, 19, 13) → true
//        lastDigit(23, 19, 12) → false
//        lastDigit(23, 19, 3) → true
public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }

    public static boolean lastDigit(int a, int b, int c) {
        boolean result = false;
        int aa = a%10;
        int bb = b%10;
        int cc = c%10;

        if((aa == bb) || (bb == cc) || (aa == cc)) result = true;



                return result;
    }
}
