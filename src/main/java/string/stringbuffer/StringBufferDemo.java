package string.stringbuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("Hello World");
    System.out.println("Original String: " + stringBuffer);
    System.out.println("Length of the string: " + stringBuffer.length());
    System.out.println("Character at position 5: " + stringBuffer.charAt(5));
    System.out.println("Substring from position 3 to 7: " + stringBuffer.substring(3, 8));
    System.out.println("Reverse the string: " + stringBuffer.reverse());
    }
}
