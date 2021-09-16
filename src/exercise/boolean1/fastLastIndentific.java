package exercise.boolean1;

import java.util.Scanner;

public class fastLastIndentific {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println(identic(userName));
    }
    public static boolean identic(String str){
        boolean result = false;
        int n = str.length();
        for(int i = 0; i<str.length()/2; i++){
            if( str.charAt(i) == (str.charAt((n-1)-i))){
                result = true;
            } else result = false;
        }

    return result;}
}
