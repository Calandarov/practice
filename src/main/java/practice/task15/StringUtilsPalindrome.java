/*
* Реализовать метод, который проверяет что переданная на вход строка является палиндромом (то есть читается одинаково в обоих направлениях)
* Примеры строк-палиндромов: шалаш; доход; заказ; Лёша на полке клопа нашёл
* Все знаки препинания, цифры и специальные символы должны игнорироваться методом в вычислении палиндрома
* Если переданная строка состоит только из спецсимволов, то метод должен вернуть false
*/
package practice.task15;

import java.util.Arrays;

public class StringUtilsPalindrome {
    private StringUtilsPalindrome() {
    }

    private static boolean isPalindrome(String input) {
        char[] inputStr = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                inputStr[i] = input.charAt(i);
            }
        }

        System.out.println(Arrays.toString(inputStr));
        return false;
    }
}
