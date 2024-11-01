package lesson19.threads;

public class Pevets1 extends Thread {
    private boolean isRunning = true;
    @Override
    public void run() {
        //БЛОК поем песню
        int count = 0;
        while (isRunning) {
            count++;
            if(count>3){
                isRunning = false;

            }
            for (int i = 0; i < 3; i++) {
                System.out.println("LA ---------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            //будим второго певца
            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();

            }
            //входим в режим ожидания
            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
