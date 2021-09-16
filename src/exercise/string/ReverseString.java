package exercise.string;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("dog"));
    }

    public static String reverseString(String str){
        char[] letters = new char[str.length()];

        int letterIndex = 0;
        for (int i = str.length()-1; i>=0; i--){
        letters[letterIndex] = str.charAt(i);
        letterIndex++;

        }
        String reverse = "";
        for (int i = 0; i <str.length();i++){
            reverse = reverse+letters[i];
        }
        return reverse;
    }
}
