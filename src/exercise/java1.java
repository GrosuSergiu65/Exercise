package exercise;

public class java1 {
    public static void main(String[] args) {

    }

    public int count(int[] array, int number) {
       int counter = 0;


    for (int i = 0; i<array.length-1; i++){
        for(int j = 0; j<array.length-1; j++){
            if(number == array[i] + array[j]){
                counter++;
            }
        }

    }
        return counter;}
}
