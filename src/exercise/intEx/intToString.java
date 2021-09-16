package exercise.intEx;

/*Given a mathematical expression as a string you must return the result as a number.

 */
public class intToString {
    public static void main(String[] args) {
        System.out.println(calculate("1+1"));
        System.out.println(calculate("1-1"));
        System.out.println(calculate("10*1"));
        System.out.println(calculate("4/2"));
    }
    public static double calculate(String str){
        System.out.println("Operators that you have to calculate: " +str);
        String[] operators =str.split("[0-9]+");
        String[] operands =str.split("[*/+-]");
        int agregate = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            if(operators[i].equals("+"))
                agregate += Integer.parseInt(operands[i]);
            else if(operators[i].equals("-"))
                agregate -= Integer.parseInt(operands[i]);
            else if(operators[i].equals("/"))
                agregate /= Integer.parseInt(operands[i]);
            else
                agregate *= Integer.parseInt(operands[i]);
        }
        System.out.print("The result is: " );
        return agregate;
    }

    }

