package javabasics.arrays.onedimensinal;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5, 0, 4, 9};
        int[] destinationArray = {2,3,4,5,6,7, 8 , 9, 10};
        System.arraycopy(sourceArray, 2, destinationArray, 3, 5);
        for(int i = 0; i < destinationArray.length; i++){
            System.out.print(destinationArray[i] + " ");
        }
    }
}
