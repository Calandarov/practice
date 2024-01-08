/*
* Дано число.
* Реализуйте метод, который принимает число и возвращает в виде строки все чётные числа от 1 до переданного числа включительно.
* Если передано отрицательное число метод должен вернуть пустую строку. Если передан 0, то метод должен вернуть 1.
* Пример вывода для числа 5: 24
*/
package practice.task7;

public class MathUtilArray {
    private MathUtilArray() {}
    public static String getEvenNumbersUpTo(byte number) {
        if(number < 0) {
            return "";
        } else if(number == 0) {
            return "1";
        }

        StringBuilder evenNum = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                evenNum.append(i);
            }

            num.append(i);
        }
        return String.format("%s: %s", num, evenNum);
    }
}
