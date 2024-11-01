package lesson19;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i < 1020; i++){
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
