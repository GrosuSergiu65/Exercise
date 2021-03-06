package exercise;
//Given a string, compute a new string by moving the first char to come after the next two chars,
// so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
// Ignore any group of fewer than 3 chars at the end.
//
//        oneTwo("abc") → "bca"
//        oneTwo("tca") → "cat"
//        oneTwo("tcagdo") → "catdog"
public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }
    public static String oneTwo(String str){
        String result = "";
        if(str.length()<=2){return "";}else
        for(int i =0; i<=str.length()-3;i+=3){
            result += str.substring(i+1, i+3)+str.charAt(i) ;
        }


        return result.toString();
    }
}
