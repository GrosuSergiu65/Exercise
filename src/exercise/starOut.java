package exercise;
//Return a version of the given string,
// where for every star (*) in the string the star and the chars immediately to its left and right are gone.
// So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//
//        starOut("ab*cd") → "ad"
//        starOut("ab**cd") → "ad"
//        starOut("sm*eilly") → "silly"
public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
        System.out.println(starOut("sm*eil*ly"));
        System.out.println(starOut("*str*in*gy"));
        System.out.println(starOut("*"));
    }

    public static String starOut(String str) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == '*') {
                    int stars = 1;
                    if(i + stars < str.length()){
                        while (str.charAt(i + stars) == '*') {
                            stars++;
                        }
                    }
                    return starOut(
                            str.substring(0, ReturnClampedIndex(str, i-1)) +
                            str.substring(ReturnClampedIndex(str, i+stars+1)));
                }
            }
            return str;
        }
        
    public static int ReturnClampedIndex(String str, int index){
        if(index < 0) return 0;
        if(index > str.length()) return str.length();
        return index;
    }


//    for (int i = 0; i <= str.length() - 1; i++) {
//        if (str.charAt(i) == '*') {
//            int stars = 1;
//            if(i + stars < str.length()){
//                while (str.charAt(i + stars) == '*') {
//                    stars++;
//                }}
//            return starOut(str.substring(0, i-1 >= 0 ? i-1 : 0)
//                    + str.substring(i+stars+1 > str.length() ? str.length() : i+stars+1));
//        }
//    }
//            return str;
//}
}
