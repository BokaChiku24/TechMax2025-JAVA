package javabasics.arrays.onedimensinal;

public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 15, 5, 30};
        System.out.println("Original array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
