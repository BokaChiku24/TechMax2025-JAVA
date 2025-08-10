package javabasics.arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] number = new int[25];
        System.out.println("Numbers in the array 'a' are:");
        for(int i = 0; i < number.length; i++){
            number[i] = i* 2;
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("Length of the array: " + number.length);
        for(int i = 0; i<number.length; i++){
            System.out.println("Value at index " + i + ": " + number[i]);
        }
    }
}
