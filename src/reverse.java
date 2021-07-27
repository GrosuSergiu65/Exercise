public class reverse {
    public static void main(String[] args) {
        System.out.println(xxx("the sky is blue"));
    }
    public static String xxx(String s){
        if (s==null)
        return null;
        String [] split = s.split (" ");
        String tmp;
        int len = split.length;
        for(int i =0; i<len/2; i++){
            tmp = split[i];
            split [i] = split[len - i -1];
            split[len -i -1] =tmp;
        }
        return String.join(" ", split);
    }
}
