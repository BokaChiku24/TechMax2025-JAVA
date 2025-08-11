package javabasics.method;

public class NestingMethods {
    int m, n;
    NestingMethods(int m, int n) {
        this.m = m;
        this.n = n;
    }
    int maximum(){
        if(m > n){
            return m;
        }else {
            return n;
        }
    }

    void print(){
        int max = maximum();
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        NestingMethods obj = new NestingMethods(5, 10);
        obj.print();
    }
}
