package exercise;

/*Given a non-empty string like "Code" return a string like "CCoCodCode".

Exercise.stringSplosion("Code") → "CCoCodCode"
Exercise.stringSplosion("abc") → "aababc"
Exercise.stringSplosion("ab") → "aab"
*/
public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<=str.length(); i++){
            result.append(str.substring(0, i));
        }return result.toString();
    }
}
