package exercise;/*Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
 */

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Ab", 3));

    }

    public static String frontTimes(String str, int n) {
        String tempa = "";
        if (str.length() < 3) {
            for (int j = 0; j < n; j++) {
                tempa += str; }
        } else {
            for (int i = 0; i < n; i++) {
                tempa += str.substring(0, 3);
            }
        }
        return tempa;
    }
}
