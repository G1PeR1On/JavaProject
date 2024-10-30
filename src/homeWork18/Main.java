package homeWork18;

public class Main {
    public static void main(String[] args) {
        NumberFinder finder = new NumberFinder();
        String text = "Here are some numbers: 12.34, -56.78 and 90.0.";

        try {
            double[] numbers = finder.findNumbers(text);
            for (double number : numbers) {
                System.out.println(number);
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

