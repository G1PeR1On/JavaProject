package lesson19.threads;

public class Pevets2 extends Thread {
    @Override
    public void run() {
        //входим в режим ожидания
        synchronized (Monitors.MIKROFON){
            try {
                Monitors.MIKROFON.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //БЛОК поем песню
        while (true) {
            for (int i = 0; i < 2; i++) {
                System.out.println(" --------- FA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            //будим первого певца
            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();

            }


        }

    }
}
