package exercise.mapEx;

import java.util.HashMap;
import java.util.Map;

//Given a map of food keys and topping values, modify and return the map as follows:
//        if the key "potato" has a value, set that as the value for the key "fries".
//        If the key "salad" has a value, set that as the value for the key "spinach".
//
//        topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
public class topping3 {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");

        System.out.println(topping3(map));
    }
    public static Map<String, String> topping3(Map<String, String> map){
        if(map.get("potato")!=null)
            map.put("fries", map.get("potato"));
        if(map.get("salad")!=null)
            map.put("spinach", map.get("salad"));

        return map;
    }
}
