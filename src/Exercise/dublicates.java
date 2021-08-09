package Exercise;

public class dublicates {
    public static void main(String[] args) {
        System.out.println(dublicate("How many Exercise.dublicates do i have in this sencense"));

    }

    public static String dublicate(String str) {
        String characters = "";
        String dublicat = "";

        for (int i = 0; i < str.length(); i++) {
            String current = Character.toString(str.charAt(i));
            if (characters.contains(current)) {
                if (!dublicat.contains(current)) {
                    dublicat += current + ",";
                }
            }
                characters += current;
            }return dublicat;
        }
    }

