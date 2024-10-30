package lesson18;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(10);
        } catch (UncurrentAgeException e) {

            System.out.println(e.getMessage());
        }


        System.out.println("Программа работает дальше");
    }
}
