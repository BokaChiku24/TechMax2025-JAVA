package thread.innerthread;

class Customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("Current Balance: " + this.amount);
        System.out.println("Withdrawal in progress...");
        if(this.amount<amount){
            System.out.println("Insufficient balance");
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Remaining Balance: " + this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("Current Balance: " + this.amount);
        System.out.println("Deposit in progress...");
        this.amount += amount;
        System.out.println("New Balance: " + this.amount);
        notifyAll();
    }
}

public class Demo {
    public static void main(String[] args) {
        final Customer customer = new Customer();
        new Thread(){
            public void run(){
                customer.withdraw(5000);
            }
        }.start();
        new Thread(){
            public void run(){
                customer.deposit(2000);
            }
        }.start();
    }
}
