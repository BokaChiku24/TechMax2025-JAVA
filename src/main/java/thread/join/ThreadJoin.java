package thread.join;

class MyRunnable implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is done");
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");
        t1.start();

        // Start the second thread after 2 seconds
        try{
            t1.join(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

        // start third thread once t1 finishes
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t3.start();
        System.out.println("Main thread is done");

        // Wait for all threads to finish
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads are finished");
    }
}
