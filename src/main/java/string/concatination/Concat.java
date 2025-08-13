package string.concatination;

public class Concat {
    public static void main(String[] args) {
        int age = 34;
        String string = "Kunal's age is " + age;
        String string2 = "We can" + " break very long strings " + "like this";
        System.out.println(string);
        System.out.println(string2);
        System.out.println(string + " and " + string2);
        System.out.println("Addition is: " + 35 + 5); // Addition is: 355
        System.out.println("Addition is: " + (35 + 5)); // Addition is: 40
    }
}
