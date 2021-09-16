package exercise;
//A sandwich is two pieces of bread with something in between.
// Return the string that is between the first and last appearance of "bread" in the given string,
// or return the empty string "" if there are not two pieces of bread.
//
//        getSandwich("breadjambread") → "jam"
//        getSandwich("xxbreadjambreadyy") → "jam"
//        getSandwich("xxbreadyy") → ""
public class getSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    public static String getSandwich(String str){
        String result = "";
        if(str.length()>=10){
            for(int i = 0; i<=str.length()-5; i ++){
                if(str.startsWith("bread", i)){
                    for(int j = str.length(); j>=i+6; j--){
                        if(str.startsWith("bread", j-5)){
                            result+= str.substring(i+5, j-5);
                            break;
                        }
                    }
                    break; }
            }}
        return result;}
}
