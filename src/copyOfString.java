public class copyOfString {
    public static void main(String[] args) {
        stringTimes("Hi", 2);
        stringTimes("Hi",3);
        stringTimes("Hi", 1);
    }
    public static String stringTimes(String str, int n){
        String last = "";
        for(int i = 0; i<n; i++){
            last+=str;
        }
        return last;
    }
}




