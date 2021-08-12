package exercise;

public class intExercie {
    public static void main(String[] args) {
        max1020(11, 19);
        max1020(19, 11);
        max1020(11, 9);
    }
    public static int max1020(int a, int b) {
        if ((a>=10 && b<=20) && (b>=10 && a<=20)){
            return Math.max(a, b);
        }else{
            return 0;}
        }
    }

//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.