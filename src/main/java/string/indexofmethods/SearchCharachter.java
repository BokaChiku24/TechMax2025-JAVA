package string.indexofmethods;

public class SearchCharachter {
    public static void main(String[] args) {
        String string = "The Enterprise JavaBean extends Java application to the new functionality" +
                " and specification";
        System.out.println(string);
        int index = string.indexOf('J');
        System.out.println("Index of first occurrence of 'J': " + index);
        System.out.println("Index of last occurrence of 'J': " + string.lastIndexOf('J'));
        int count = string.length() - string.replaceAll("J", "").length();
        System.out.println("Number of occurrences of 'J': " + count);
        System.out.println("Character 'J' at index " + index + " is uppercase: " + Character.isUpperCase(string.charAt(index)));
        System.out.println("Character 'J' at index " + index + " is lowercase: " + Character.isLowerCase(string.charAt(index)));
        System.out.println("Character 'J' at index " + index + " is a letter: " + Character.isLetter(string.charAt(index)));
        System.out.println("Character 'J' at index " + index + " is a digit: " + Character.isDigit(string.charAt(index)));

    }
}
