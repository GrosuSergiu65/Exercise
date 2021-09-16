package exercise.intEx;

public class mathAbs {
    public static void main(String[] args) {
        close10(8, 13);
        close10(13, 8);
        mathAbs.close10(13, 7);
    }
    public static int close10(int a, int b) {
        int temp1 = Math.abs(a - 10);
        int temp2 = Math.abs(b - 10);
        System.out.println(temp1);
        System.out.println(temp2);
        if (temp1 == temp2)
            return 0;
        else if (temp1 > temp2)
            return b;
        else
            return a;
    }

}
//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//close10(8, 13) → 8
//close10(13, 8) → 8
//close10(13, 7) → 0