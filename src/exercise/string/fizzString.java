package exercise.string;
/*Given a string str, if the string starts with "f" return "Fizz".
 If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
 In all other cases, return the string unchanged.

 */
public class fizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("Buzz"));
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str){
        String result="";
        if(str.startsWith("f")){
            return result = "Fizz";
        } else if(str.endsWith("b")){
            return result = "Buzz";
        }else if(str.startsWith("f") && str.endsWith("b")){
            return result = "FizzBuzz";
        }else return str;
    }
}
