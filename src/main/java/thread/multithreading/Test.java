package thread.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test extends Thread {
    public int array[][] = new int[5][5];
    public int s, t= 0;
    int i, j;
    public void readMatrix() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print("Enter element at (" + i + "," + j + "): ");
                array[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
    }
    
    public void createThread(){
        Test obj[] = new Test[5];
        for(i=0; i<5; i++){
            obj[i] = new Test();
            obj[i].s = i;
            obj[i].start();
        }
    }
    
    public void displayMatrix(){
        int i, j;
        System.out.println("Matrix is: ");
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void run(){
        for(int i = 0; i<5; i++){
            s = s + array[t][i];
        }
        System.out.println("Sum of row " + (i+1) + " is: " + s);
        s = 0;
        t++;
    }

    public static void main(String[] args) throws IOException {
        Test obj = new Test();
        obj.createThread();
        obj.readMatrix();
        obj.displayMatrix();
    }
}
