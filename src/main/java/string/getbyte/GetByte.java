package string.getbyte;

import java.io.UnsupportedEncodingException;

public class GetByte {
    public static void main(String[] args) {
        String string = "Welcome to Java";
        byte[] bytes;
        try{
            bytes = string.getBytes("UTF-8");
            for(byte b : bytes){
                System.out.print(b);
            }
            System.out.println();
            bytes = string.getBytes("ISO-8859-1");
            for(byte b : bytes){
                System.out.print(b);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
