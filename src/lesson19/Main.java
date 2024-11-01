package lesson19;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        Thread myThread2 = new Thread( new MyThread2());
        myThread2.start();
        for (int i = 0; i < 20; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
