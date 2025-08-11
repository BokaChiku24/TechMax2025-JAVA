package oops.accessmodifiers.challangeone.operation;

public class Maximum {
    public static int findMaximum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
