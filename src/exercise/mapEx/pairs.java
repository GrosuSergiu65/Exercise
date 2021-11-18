package exercise.mapEx;

//Given an array of non-empty strings, create and return a Map<String, String> as follows:
//        for each string add its first character as a key with its last character as the value.
//
//        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//        pairs(["man", "moon", "main"]) → {"m": "n"}
//        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

import java.util.Map;
import java.util.TreeMap;

public class pairs {

    public static void main(String[] args) {

    }

    public static Map<String, String> pairs(String[] strings){

        Map<String, String> map = new TreeMap<>();
        String use = "";
        for (int i = 0; i < strings.length;i++){
            use = strings[i];
            map.put(use.substring(0,1), use.substring(use.length()-1));
        }

            return map;
    }
}
