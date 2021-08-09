package Exercise;

public class ThreeOfE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
    public static boolean stringE(String str){
        int counter = 0;
        int len = str.length();

        for(int i =0; i <len; i++){
            if(str.charAt(i) == 'e')
                counter++;
        }

        if(counter>=1 && counter<=3)
            return true;
        else
            return false;
    }
}



//Return true if the given string contains between 1 and 3 'e' chars.

   //     stringE("Hello") → true
     //   stringE("Heelle") → true
    //    stringE("Heelele") → false
