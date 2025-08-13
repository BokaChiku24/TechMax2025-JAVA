package oops.statickeyword.staticblock;

class Sample {
    static{
        System.out.println("Static block called in sample class");
    }
    public void check(){
        System.out.println("Inside check method");
    }
}

public class StaticBlockTwo {
    static int x;
    static int y;
    static {
        System.out.println("Static block called");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        Sample s1 = new Sample();
        s1.check();
        System.out.println("Main method ends");
    }
}
