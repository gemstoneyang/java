package gugudan;

public class Gugudan {
    public static int[] calculate(int number, int end){
        int[] result = new int[end];
        for(int i=0; i < result.length; i++){
            result[i] = number * (i+1);
        }
        return result;
    }
    public static void print(int number, int[] result){
        for(int i=0; i < result.length; i++){
            System.out.println(number + " * " + (i+1) + " = " + result[i]);
        }
    }
}
