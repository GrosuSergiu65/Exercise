package exercise;
//Returns true if for every '*' (star) in the string,
// if there are chars both immediately before and after the star, they are the same.
//
//        sameStarChar("xy*yzz") → true
//        sameStarChar("xy*zzz") → false
//        sameStarChar("*xa*az") → true
public class sameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }
    public static boolean sameStarChar(String str){
        int len = str.length();
        for(int x = 1; x < len-1; x++){
            if (str.charAt(x) == '*' && str.charAt(x-1) != str.charAt(x+1)){
                return false;
            }
        }
        return true;}
}
