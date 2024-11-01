package lesson19.threads;

public class Vedyschiy {
    public static void main(String[] args) {
        System.out.println("Начало концерта!!!");
        Pevets1 p1 = new Pevets1();
        p1.start();

        Pevets2 p2 = new Pevets2();
        p2.setDaemon(true);
        p2.start();

        while (p1.isAlive()) {

        }

        System.out.println("Концерт оконцен!!!");


    }
}
