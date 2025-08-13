package string.charat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCharachter  {
    public static void main(String[] args) throws IOException {
        String string;
        char ch, comp;
        int i, count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        string = reader.readLine();
        System.out.println("Enter a character to count:");
        ch = (char)reader.read();
        for(i = 0; i < string.length(); i++) {
            comp = string.charAt(i);
            if(comp == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' appears " + count + " times in the string.");
    }
}
