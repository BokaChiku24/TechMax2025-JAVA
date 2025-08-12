package string.stringbuffer;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        System.out.println("Original string: " + sb);

        // Original string length
        System.out.println("Original length: " + sb.length());

        // Accessing charachters in a string
        for(int i = 0; i < sb.length(); i++) {
            int p = i+ 1;
            System.out.println("Character at position " + p + ": " + sb.charAt(i));
        }

        // Inserting a string in the middle of a string
        sb.insert(7, "Programming");
        System.out.println("After inserting 'Programming' at position 7: " + sb);

        // Reversing a string
        sb.reverse();
        System.out.println("After reversing the string: " + sb);

        // Removing a character from a string
        sb.deleteCharAt(7);
        System.out.println("After removing character at position 7: " + sb);

        // Concatenating two strings
        sb.append(" is fun");
        System.out.println("After concatenating 'is fun': " + sb);

        // Changing the case of a string
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        System.out.println("After changing the case: " + sb);

        // Modifying a string
        sb.replace(0, 5, "Goodbye");
        System.out.println("After modifying the string: " + sb);

        // Modifying characters in a string
        sb.setCharAt(0, 'G');
        sb.setCharAt(1, 'o');
        sb.setCharAt(2, 'o');
        sb.setCharAt(3, 'd');
        sb.setCharAt(4, 'b');
        sb.setCharAt(5, 'y');
        System.out.println("After modifying characters: " + sb);

        // Append a string to the end of the string
        sb.append(" its fantastic ");
        System.out.println("After appending 'Java': " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reversing the string: " + sb);

        // Remove all characters from a string
        sb.setLength(0);
        System.out.println("After removing all characters: " + sb);
    }
}
