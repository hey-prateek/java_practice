class thread {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void method1() {
        synchronized (lock1) {
            System.out.println("acquired lock1");
            synchronized (lock2) {
                System.out.println("acquired lock2");
            }
        }
    }

    void method2() {
        synchronized (lock2) {
            System.out.println("acquired lock2");
            synchronized (lock1) {
                System.out.println("acquired lock1");
            }
        }
    }
}

public class deadlockExample {
    public static void main(String[] args) {
        thread demo = new thread();
        Thread t1 = new Thread(demo::method1, "Thread-1");
        Thread t2 = new Thread(demo::method2, "Thread-2");

        t1.start();
        t2.start();

    }
}
