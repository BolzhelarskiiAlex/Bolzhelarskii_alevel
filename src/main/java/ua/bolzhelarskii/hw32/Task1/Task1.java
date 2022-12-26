package ua.bolzhelarskii.hw32.Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task1 {
    private static int commonVariable = 50;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(100);
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                try {
                    lock.lock();
                    System.out.println(commonVariable += 2);
                } finally {
                    lock.unlock();
                }
            });
        }
        service.shutdown();
    }
}