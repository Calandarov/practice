/*
* Реализуйте метод, который принимает трёхзначное число и проверяет,
* является ли оно ""дважды чётным"" (сумма и произведение его цифр являются чётными)
* Если переданное число имеет больше или меньше чисел чем 3 метод должен вернуть отрицательный результат.
*/
package practice.task9;

public class ConditionalUtilsTwiceEven {
    private ConditionalUtilsTwiceEven() {}

    public static boolean isDoublePrime(int inputNumber) {
        String number = String.valueOf(inputNumber);

        if(number.length() != 3) {
            return false;
        }

        char[] numbers = number.toCharArray();
        int sum = 0;
        int mult = 1;

        for (char c : numbers) {
            sum += Character.getNumericValue(c);
            mult *= Character.getNumericValue(c);
        }

        return sum % 2 == 0 && mult % 2 == 0;
    }
}
