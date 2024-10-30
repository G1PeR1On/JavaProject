package homeWork18;

import java.util.ArrayList;

public class WordFinder {

    /**
     * Ищет все вхождения слова в тексте и возвращает массив индексов слов.
     *
     * @param text исходный текст
     * @param word искомое слово
     * @return массив индексов каждого вхождения слова
     * @throws NullPointerException если текст или слово равны null
     */
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Text or word cannot be null");
        }

        ArrayList<Integer> indices = new ArrayList<>();
        int index = text.indexOf(word);

        while (index != -1) {
            indices.add(index);
            index = text.indexOf(word, index + 1);
        }

        return indices.stream().mapToInt(Integer::intValue).toArray();
    }

}
