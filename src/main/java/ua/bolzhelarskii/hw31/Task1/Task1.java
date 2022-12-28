package ua.bolzhelarskii.hw31.Task1;

class Task1 {
    public static void main(String[] args) throws InterruptedException {
        int count = 50;
        for (int i = 0; i < count; i++) {
            int treadIndex = count - i - 1;
            Thread myThread = new Thread(() -> {
                Thread.currentThread().setName(String.valueOf(treadIndex));
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            });
            myThread.start();
            myThread.join();
        }
    }
}