package tasks;

import lombok.Synchronized;

public class SynchronizedExample {
    private final Object lock1 = new Object();

    @Synchronized
    public static void exampleMethod1() {
        System.out.println("Hello");
    }

    @Synchronized
    public String exampleMethod2() {
        return "Hello";
    }

    @Synchronized("lock1")
    public int exampleMethod3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }

    public int exampleMethod3WithoutSync(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
