package c.exception;

public class ExceptionSample {
    
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBounds();
    }
    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
            System.out.println("This code should run.");
        } catch (Exception e) {
            System.out.println("Exception occured.");
        }
        System.out.println("This code must run");
    }
}