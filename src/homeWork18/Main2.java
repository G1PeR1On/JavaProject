package homeWork18;

public class Main2 {
    public static void main(String[] args) {
        WordFinder finder = new WordFinder();
        String text = "This is a test. This test is only a test.";
        String word = "test";
        String word1 = null;

        int[] indices = finder.findWord(text, word);
        for (int index : indices) {
            System.out.println(index);
        }
    }
}
