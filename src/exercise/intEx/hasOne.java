package exercise.intEx;


//Given a positive int n, return true if it contains a 1 digit.
//        Note: use % to get the rightmost digit, and / to discard the rightmost digit.
//
//
//        hasOne(10) → true
//        hasOne(22) → false
//        hasOne(220) → false

public class hasOne {
    public static void main(String[] args) {
        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));
    }

    public static boolean hasOne(int n) {
        String work = String.valueOf(n);
        for (int index = 0; index < work.length(); index++) {
            if (work.charAt(index) == '1') {
                return true;
            }
        }
        return false;
    }
}
