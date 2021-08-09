package Exercise;

/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 Exercise.substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

Exercise.stringMatch("xxcaazz", "xxbaaz") → 3
Exercise.stringMatch("abc", "abc") → 2
Exercise.stringMatch("abc", "axc") → 0

 */
public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        System.out.println(stringMatch("aabbccdd", "abbbxxd"));
        System.out.println(stringMatch("iaxxai", "aaxxaaxx"));
    }
    public static int stringMatch(String a, String b){
        int counter = 0;

            for(int j = 0; j<b.length()-1; j++){
                if(a.contains(b.substring(j,j+2))){
                    counter++;
                }
        }
    return counter;}
}
//
//@Override
//public static int Exercise.stringMatch(String a, String b){
//    int len = Math.min(a.length(), b.length());
//    int count = 0;
//
//    // Look at both substrings starting at i
//    for (int i=0; i<len-1; i++) {
//        String aSub = a.Exercise.substring(i, i+2);
//        String bSub = b.Exercise.substring(i, i+2);
//        if (aSub.equals(bSub)) {  // Use .equals() with strings
//            count++;
//        }
//    }
//
//    return count;
//}
//}
