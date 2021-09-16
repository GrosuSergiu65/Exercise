package exercise.string;
//Look for patterns like "zip" and "zap" in the string -- length-3,
// starting with 'z' and ending with 'p'. Return a string where for all such words,
// the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//        zipZap("zipXzap") → "zpXzp"
//        zipZap("zopzop") → "zpzp"
//        zipZap("zzzopzop") → "zzzpzp"
public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str){
        String result = "";
        if(str.length()<=2){return str;}else{
            for(int i = 0; i<=str.length()-1; i++){
                if(str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                    result += str.charAt(i);
                    result += str.charAt(i+2);
                    i+=2;
                    continue;
                }

                result += str.charAt(i);
            }
        }
        return result;}
}
