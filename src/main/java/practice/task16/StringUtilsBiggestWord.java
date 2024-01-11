/* Дана строка, реализовать метод который ищет слово с наибольшим количеством букв.
* Если таких слов несколько - вывести последнее
*/
package practice.task16;

public class StringUtilsBiggestWord {
    private StringUtilsBiggestWord() {}

    public static String getLargest(String input) {
        String[] str = input.split(" ");
        String biggestWord = null;
        int strLength = 0;

        for (String s : str) {
            if (s.length() >= strLength) {
                biggestWord = s;
                strLength = s.length();
            }
        }

        return biggestWord;
    }
}
