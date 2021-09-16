package exercise.string;
//Given a string and a non-empty word string,
//        return a string made of each char just before and just after every appearance of the word in the string.
//        Ignore cases where there is no char before or after the word,
//        and a char may be included twice if it is between two words.
//
//        wordEnds("abcXY123XYijk", "XY") → "c13i"
//        wordEnds("XY123XY", "XY") → "13"
//        wordEnds("XY1XY", "XY") → "11"
public class wordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
        System.out.println(wordEnds("abc1xyz1", "1"));
    }
    public static String wordEnds(String str, String word){
        String result = "";
        int i = 0 ;

        while(i < str.length() ) {
            if (str.substring(i).startsWith(word)) {
                if(i>0)
                    result += str.charAt(i-1);

                    if(str.length()>word.length()+i)
                result+= str.charAt(i+word.length());
                i = i + word.length();


            } else {

                i++;
            }
        }

        return result ;
    }
}
