package exercise.string;
//Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
// You may assume that n is between 0 and the length of the string, inclusive.
//
//        repeatEnd("Hello", 3) → "llollollo"
//        repeatEnd("Hello", 2) → "lolo"
//        repeatEnd("Hello", 1) → "o"
public class repeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n){
        String result = "";
        int end = str.length();
        for(int i = n; i>0; i--){
            result+= str.substring(end-n, end);
        }
    return result;}
}
