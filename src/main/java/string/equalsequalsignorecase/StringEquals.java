package string.equalsequalsignorecase;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "welcome";
        System.out.println(str1.equals(str2)); // Output: false
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
    }
}
