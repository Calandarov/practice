/*
* Реализуйте метод, который считает количество упоминаний указанного слова в строке
* Пример countWord(""Test string for test"", test) должен вернуть 2
*/
package practice.task18;

public class StringUtilsCountWord {
    private StringUtilsCountWord() {}

    public static int countWord(String input, String word) {
        int count = 0;
        String[] words = input.split(" ");

        for(String s : words) {
            if(s.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}
