package exercise;
/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

 */
public class twoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1,2,3));
        System.out.println(twoAsOne(3,1,2));
        System.out.println(twoAsOne(3,2,2));
    }
    public static boolean twoAsOne(int a, int b, int c){
        boolean result  =false;
        if((a+b==c) || (b+c==a) || (c+a==b))
            result = true;


        return result;
    }
}
