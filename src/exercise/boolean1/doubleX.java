package exercise.boolean1;


public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxxx"));
        System.out.println(doubleX("xaxxxxx"));
    }

    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }
}
