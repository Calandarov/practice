/*
* Реализовать метод, который проверяет что переданная на вход строка является палиндромом (то есть читается одинаково в обоих направлениях)
* Примеры строк-палиндромов: шалаш; доход; заказ; Лёша на полке клопа нашёл
* Все знаки препинания, цифры и специальные символы должны игнорироваться методом в вычислении палиндрома
* Если переданная строка состоит только из спецсимволов, то метод должен вернуть false
*/
package practice.task15;


public class StringUtilsPalindrome {
    private StringUtilsPalindrome() {
    }

    public static boolean isPalindrome(String input) {
        String str = input.replaceAll("[^a-zA-Zа-яА-Я]+", "");

        if(str.isEmpty()) {
            return false;
        }

        StringBuilder builder = new StringBuilder(str).reverse();

        return str.equalsIgnoreCase(builder.toString());
    }
}
