package exercise.mapEx;

//Given an array of strings, return a Map<String, Boolean>
// where each different string is a key and its value is true if that string appears
// 2 or more times in the array.
//
//        wordMultiple(["a", "b", "a", "c", "b" , "a"]) → {"a": true, "b": true, "c": false}
//        wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//        wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.Map;
import java.util.TreeMap;

public class wordMultiple {

    private static final wordMultiple obj = new wordMultiple();
    private static final String[] arr = {"a", "b", "a", "c", "b"};

    public static void main(String[] args) {
        System.out.println(obj.wordMultiple(arr));
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new TreeMap<>();

        for (int index = 0; index < strings.length; index++) {
            if (!map.containsKey(strings[index])) {
                map.put(strings[index], false);
            }

            else if (map.containsKey(strings[index])) {
                map.put(strings[index], true);
            }
        }

        return map;
    }

}
