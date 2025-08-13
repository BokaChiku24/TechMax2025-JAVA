package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisplayCharacterFile {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(args[0]);
        } catch (ArrayIndexOutOfBoundsException w) {
            System.out.println("Insufficient arguments. Please provide a file path.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String string = new String(args[0]);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            System.out.println(string.charAt(i));
        }
    }

}
