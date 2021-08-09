package Exercise;

public class java {
    public static void main(String[] args) {
        System.out.println(count("Apple", 'p'));
    }
    public static long count(String string, char charToCount) {

        long counter = 0;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == charToCount){
                counter ++;
            }
        }
        return counter;}

}
