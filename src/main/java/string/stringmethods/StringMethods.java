package string.stringmethods;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello Java";
        String s2 = " Hello ";
        String s3 = "BYE BYE";

        System.out.println(s1);
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Uppercase of s1: " + s1.toUpperCase());
        System.out.println("Lowercase of s1: " + s1.toLowerCase());
        System.out.println("Is s1 equal to s2? " + s1.equals(s2));
        System.out.println("Trim s2: " + s2.trim());
        System.out.println("Replace 'BYE' with 'World' in s3: " + s3.replace(" BYE", " World"));
        System.out.println("Substring of s1: " + s1.substring(0, 5));
        System.out.println("Index of 'Java' in s1: " + s1.indexOf("Java"));
        System.out.println("Last index of 'a' in s1: " + s1.lastIndexOf("a"));
        System.out.println("Character at index 6 in s1: " + s1.charAt(6));
        System.out.println("Is s1 empty? " + s1.isEmpty());
        System.out.println("Is s1 equal to s2 ignoring case? " + s1.equalsIgnoreCase(s2));
        System.out.println("Compare s1 to s2: " + s1.compareTo(s2));
    }
}
