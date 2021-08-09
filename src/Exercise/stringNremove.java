package Exercise;/*Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 */


public class stringNremove {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg",3));
    }

    public static String everyNth(String str, int n){
        String sort = "";
        int temp = n;
        sort = str.substring(0, 1);
        for(int i = 0; i<str.length(); i++){

            if(str.length()> n ){
                sort += str.charAt(n);
            }
            n+=temp;
        }
        return sort;
    }
}
