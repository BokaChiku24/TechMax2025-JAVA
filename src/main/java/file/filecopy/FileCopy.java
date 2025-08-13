package file.filecopy;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void copyFile(String source, String destination) throws Exception {
        try{
            File f1 = new File(source);
            File f2 = new File(destination);
            if (!f1.exists()) {
                throw new Exception("Source file does not exist.");
            }
            if (f2.exists()) {
                throw new Exception("Destination file already exists.");
            }
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f2, true));
            String line = " ";
            while((line = br.readLine())!= null){
                bufferedWriter.write(line.toUpperCase());
            }
            br.close();
            System.out.println("File copied successfully.");
        } catch (Exception e) {
                throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter source file along with path");
        String source = input.nextLine();
        System.out.print("Enter destination file along with path");
        String destination = input.nextLine();
        try {
            copyFile(source, destination);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
