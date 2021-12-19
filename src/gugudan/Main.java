package gugudan;
import java.util.Scanner;

public class Main {
    public static String scanValue(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }
    public static void main(String[] args){
        String inputValue = scanValue();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        for(int i=2; i < first+1; i++){
            int[] result = Gugudan.calculate(i, second);
            Gugudan.print(i, result);
        }
    }
}