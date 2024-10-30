package homeWork18;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class NumberFinder {

    /**
     * Находит в тексте все double числа и возвращает их в виде массива.
     * Если чисел не обнаружено в тексте, выбрасывает исключение CustomException.
     *
     * @param text исходный текст
     * @return массив double чисел
     * @throws CustomException если чисел в тексте не обнаружено
     */
    public double[] findNumbers(String text) throws CustomException {
        if (text == null || text.isEmpty()) {
            throw new CustomException("Not found");
        }

        ArrayList<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }

        if (numbers.isEmpty()) {
            throw new CustomException("Not found");
        }
        return numbers.stream().mapToDouble(Double::doubleValue).toArray();
    }


}
