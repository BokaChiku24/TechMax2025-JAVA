package exceptionhandling.trycatch;

public class NegativeArray {
    public static void main(String[] args) {

        try{
            int[] numbers = new int[-5];
            System.out.println("Array created successfully");
        }catch (NegativeArraySizeException e){
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Array size cannot be negative");
        }

    }
}
