package thread.synchronization;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

class C implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread C: " + i);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");
        synchronized (new Thread()){
            new Thread(new A()).start();
            new Thread(new B()).start();
            new Thread(new C()).start();
        }
        System.out.println("Main thread is stopping");
    }
}
