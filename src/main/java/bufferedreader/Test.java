package bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        String string;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter a string:");
            System.out.println("Enter stop to quit");
            do{
                string = reader.readLine();
                System.out.println("Entered string: " + string);
            }while(!string.equalsIgnoreCase("stop"));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
