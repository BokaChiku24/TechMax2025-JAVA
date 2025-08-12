package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("Parent Directory: " + file.getParent());
        System.out.println("Path" + file.getPath());
        System.out.println(file.exists()? "File exists" : "File does not exist");
        System.out.println(file.isFile()? "File is a regular file" : "File is not a regular file");
        System.out.println(file.isDirectory()? "File is a directory" : "File is not a directory");
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + file.lastModified());
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writeable: " + file.canWrite());
        System.out.println("Is Executable: " + file.canExecute());
    }
}
