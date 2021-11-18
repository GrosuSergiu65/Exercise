package exercise.mapEx;

//Loop over the given array of strings to build a result string like this:
// when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
// Return the empty string if no string appears a 2nd time.
//
//        wordAppend(["a", "b", "a"]) → "a"
//        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//        wordAppend(["a", "", "a"]) → "a"

import java.util.Map;
import java.util.TreeMap;

public class wordAppend {
    private static final wordAppend obj = new wordAppend();

    public static void main(String[] args) {
        String [] arr = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(obj.wordAppend(arr));
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            int counter = 1;
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], counter);
            } else if (map.containsKey(strings[i])) {
                counter = map.get(strings[i])+1;
                map.put(strings[i], counter);
                if(counter%2==0){result = result+strings[i];}
            }
        }
        return result;
    }

}
