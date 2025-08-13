package javabasics.finalize;

class Finalizer {

    public Finalizer() {
        System.out.println("Finalizer constructor called");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizer called");
        throw new Exception("Exception from finalize method");
    }

    public void set() {
        System.out.println("Finalizer set called");
    }

}

public class FinalizerDemo {
    public static void main(String[] args) {
        Finalizer obj = new Finalizer();
        obj.set();
        obj = null; // Finalizer object will be garbage collected here
        System.gc(); // Request for garbage collection
        try {
            Thread.sleep(1000); // Wait for some time for garbage collector to collect the object
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
