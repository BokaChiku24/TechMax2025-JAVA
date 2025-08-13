package thread.priorities;

class A extends Thread {
    public int count = 0;
    public boolean iterunning = true;
    public void run() {
        while (iterunning) {
            System.out.println("Thread A: " + count++);
        }
    }
    public void stopThread() {
        iterunning = false;
    }
}

public class Priority {
    public static void main(String[] args) {
        A a = new A();
        a.setPriority(Thread.MAX_PRIORITY);
        a.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        a.stopThread();
        System.out.println("Thread A stopped");

        A a2 = new A();
        a2.setPriority(Thread.NORM_PRIORITY + 2);
        a2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        a2.stopThread();
        System.out.println("Thread A2 stopped");

        A a3 = new A();
        a3.setPriority(Thread.MIN_PRIORITY - 2);
        a3.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        a3.stopThread();

    }
}
