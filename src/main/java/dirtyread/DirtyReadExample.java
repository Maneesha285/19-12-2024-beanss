package dirtyread;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }
}

public class DirtyReadExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        Thread t1 = new Thread(() -> {
            synchronized (account) {
                account.setBalance(1200.00); // Uncommitted change
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Transaction committed");
            }
        });

        // Thread 2: Reads the balance
        Thread t2 = new Thread(() -> {
            synchronized (account) {
                System.out.println("Balance read: " + account.getBalance());
            }
        });

        t1.start();
        try {
            Thread.sleep(1000); //  t2 runs during t1's delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

