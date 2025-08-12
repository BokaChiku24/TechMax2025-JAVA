package string.stringarrya;

public class StringTest {
    public static void main(String[] args) {
        String[] names = {"Kunal", "Chavan", "Chandan"};
        StringTest.printNames(names);
    }

    public static void printNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
