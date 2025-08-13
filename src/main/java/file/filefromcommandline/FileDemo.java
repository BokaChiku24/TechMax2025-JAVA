package file.filefromcommandline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(args[0]);
            System.out.println("File opened successfully");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient arguments. Please provide a file path.");
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
       String string = new String(args[0]);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            System.out.println(string.charAt(i));
        }
    }
}
