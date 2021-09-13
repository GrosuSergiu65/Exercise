package exercise;
//Return true if the string "cat" and "dog" appear the same number of times in the given string.
//
//        catDog("catdog") → true
//        catDog("catcat") → false
//        catDog("1cat1cadodog") → true
public class catDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {
        boolean result = false;
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't')
                cat++;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g')
                dog++;
        }
        if (cat == dog) {
            result = true;
        }
        return result;
    }
}
