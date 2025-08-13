package oops.innerclass;

class OuterClass {
    int outerVariable = 10;

    void test() {
        InnerClass inner = new InnerClass();
        inner.display();
        System.out.println("Variable in outer class: " + outerVariable);
    }
    class InnerClass {
        int x = 20;
        void display() {
            System.out.println("Variable in outer class: " + x);
            System.out.println("Variable in inner class: " + OuterClass.this.outerVariable);
        }
    }
}
public class OuterInner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();
    }
}