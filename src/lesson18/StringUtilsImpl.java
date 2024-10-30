package lesson18;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null){
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double value1 = Double.parseDouble(number1);
        double value2 = Double.parseDouble(number2);

        if (value2==0){
            throw new ArithmeticException("Нельзя делить на 0!!!");
        }


        return value1 / value2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
