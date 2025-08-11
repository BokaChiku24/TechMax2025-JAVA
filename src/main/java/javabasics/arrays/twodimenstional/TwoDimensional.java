package javabasics.arrays.twodimenstional;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] number1 = new int[10][10];
        System.out.println("Table from 1 to 10: ");
        for(int i = 1; i<=10-1; i++){
            for(int j = 1; j<=10-1; j++){
                number1[i][j] = i * j;
                System.out.print(number1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
