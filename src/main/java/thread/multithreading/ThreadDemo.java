package thread.multithreading;

class A extends Thread {
    public void run() {
        System.out.println("Thread A is running");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B is running");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C is running");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread C: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();

        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is done");
    }
}
