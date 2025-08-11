package oops.innerclass;

class Outer {
    int outerVariable = 10;
    void display(){
        System.out.println("Outer Variable: " + outerVariable);
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display(){
            System.out.println("Inner Variable: " + outerVariable);
            System.out.println("Inner Method Called");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
