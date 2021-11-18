package exercise.mapEx;

//Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
// with the value of all the strings starting with that character appended together in the order they appear in the array.
//
//        firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//        firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//        firstChar([]) → {}

import java.util.Map;
import java.util.TreeMap;

public class firstChar {

    public static void main(String[] args) {
    String[] arr = {"salt", "tea", "soda", "toast"};
        firstChar obj = new firstChar();
        System.out.println( obj.firstChar(arr));
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new TreeMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (!map.containsKey(strings[i].substring(0,1))) {
                map.put(strings[i].substring(0,1), strings[i]);
                continue;
            }
            if (map.containsKey(strings[i].substring(0,1))) {
                String word = map.get(strings[i].substring(0,1));

                word=word+strings[i];

                map.put(strings[i].substring(0,1), word);
                continue;
            }
        }
        return map;
    }
}
