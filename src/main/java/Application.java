import lombok.NonNull;
import lombok.Synchronized;
import lombok.val;
import tasks.*;
import tasks.nonNullExample.NonNullExample;
import tasks.nonNullExample.Person;
import tasks.nonNullExample.ToStringExample;

import java.io.IOException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: " + example.exampleMethod3());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2: " + example.exampleMethod3());
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: " + example.exampleMethod3WithoutSync());
            }
        });

        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2: " + example.exampleMethod3WithoutSync());
            }
        });

        System.out.println();

        thread1.start();
        thread2.start();
    }
}
