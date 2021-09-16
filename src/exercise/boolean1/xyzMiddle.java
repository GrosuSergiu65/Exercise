package exercise.boolean1;
//Given a string, does "xyz" appear in the middle of the string?
// To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
// This problem is harder than it looks.
//
//        xyzMiddle("AAxyzBB") → true
//        xyzMiddle("AxyzBB") → true
//        xyzMiddle("AxyzBBB") → false
public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str){
        for (int i=0;i<str.length()-3;i++) {
            if (str.substring(i,i+3).equals("xyz")) {
                String front =str.substring(0,i);
                String end = str.substring(i+3);
                int a =Math.abs(front.length() -end.length());
                if (a<=1) return true;
            }
        }
        if (str.equals("xyz")) return true;
        return false;}
    }

