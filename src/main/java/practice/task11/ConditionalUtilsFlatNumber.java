/*
* Реализуйте метод, который принимает трёхзначное число и проверяет, является ли оно плоским.
* Пример плоских чисел: 111, 777, 333.
* Если переданное число имеет больше или меньше чисел чем 3 метод должен вернуть отрицательный результат.
*/
package practice.task11;

public class ConditionalUtilsFlatNumber {
    private ConditionalUtilsFlatNumber() {}

    public static boolean isFlatNumber(int inputNumber) {
        String number = String.valueOf(inputNumber);

        if(number.length() != 3) {
            return false;
        }

        char[] numbers = number.toCharArray();
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] != numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
