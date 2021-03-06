package exercise.intEx;/*
Given a string, return the count of the number of times that a Exercise.substring length 2 appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end Exercise.substring).

Exercise.last2("hixxhi") → 1
Exercise.last2("xaxxaxaxx") → 1
Exercise.last2("axxxaaxx") → 2
 */

public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }
    public static int last2(String str){
        int counter = 0;
        if (str.length()<2)return 0;
        String end = str.substring(str.length()-2);

    for(int i = 0; i<str.length()-2;i++){
        String sub = str.substring(i, i+2);
         if(sub.equals(end)){
         counter++    ;
         }
    }return counter;
    }
}
