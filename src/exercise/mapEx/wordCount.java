package exercise.mapEx;

import java.util.Map;
import java.util.TreeMap;

//The classic word-count algorithm: given an array of strings
//        , return a Map<String, Integer> with a key for each different string,
//        with the value the number of times that string appears in the array.
//
//        wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//        wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//        wordCount(["c", "c", "c", "c"]) → {"c": 4}
public class wordCount {

    public static void main(String[] args) {

    }

    public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new TreeMap<>();
    Integer counter = 0;
    for(int i =0; i< strings.length; i++){
        counter = 0;
        if(!map.containsKey(strings[i])){
            counter++;
            map.put(strings[i], counter++); continue;}
        if(map.containsKey(strings[i])){
            counter = map.get(strings[i]);
            counter++;
            map.put(strings[i], counter); continue;}
    }
        return map;
    }

}
