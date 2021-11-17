package exercise;
//Given a string and a non-empty word string,
// return a version of the original String where all chars have been replaced by pluses ("+"),
// except for appearances of the word string which are preserved unchanged.
//
//        plusOut("12xy34", "xy") → "++xy++"
//        plusOut("12xy34", "1") → "1+++++"
//        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
public class plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word){
      char [] strArray = new char[str.length()];

      for(int i = 0;i<str.length();i++){
          strArray[i] = str.charAt(i);
}

      for(int i =0; i<str.length();i++){
          System.out.print(strArray[i]);
      }
        System.out.println();
    return word;}
}
