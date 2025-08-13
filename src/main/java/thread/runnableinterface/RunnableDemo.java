package thread.runnableinterface;

class A implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        int i = 0;
        for(;i <= 10; i++){
            System.out.println("Thread A: " + i);
        }
    }
}

class B implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        int i = 0;
        for(;i <= 10; i++){
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
        int i = 0;
        for(;i <= 10; i++){
            System.out.println("Thread C: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");
        A a = new A();
        B b = new B();
        C c = new C();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        Thread threadC = new Thread(c);

        threadA.start();
        threadB.start();
        threadC.start();
        System.out.println("Main thread is done");
    }
}
