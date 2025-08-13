package javabasics.returnkeyword;

public class Return {
    public int addNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Return returnObject = new Return();
        int sum = returnObject.addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }
}
