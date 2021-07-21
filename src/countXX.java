/*Count the number of "xx" in the given string.
 We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */

public class countXX {
    public static void main(String[] args) {
        System.out.println(acountXX("abcxx"));
        System.out.println(acountXX("xxx"));
        System.out.println(acountXX("xxxx"));
    }
    public static int acountXX(String str){
        int counter = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")) counter++;
        } return counter;
    }
}
