package oops.constructor.noconstructor;

public class NoConstructor {
    public int a, b;

    public void display(){
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        NoConstructor obj = new NoConstructor();
        obj.display(); // Output: a = 0 b = 0 (Default value of int)
    }

}
