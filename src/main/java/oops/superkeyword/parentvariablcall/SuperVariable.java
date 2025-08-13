package oops.superkeyword.parentvariablcall;

class A{
    public int x;
}

class B extends A{
    public int x;
    public B(){
        super.x = 10; // Calls the parent variable x
        this.x = 20; // Local variable x
    }
    public void display(){
        System.out.println("Value of x in class A: " + super.x);
        System.out.println("Value of x in class B: " + x);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
