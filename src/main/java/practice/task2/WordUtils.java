/*
* Дана строка, состоящая из слов, разделенных пробелами.
* Необходимо реализовать метод, который возвращает строку, слова в которой записаны в обратном порядке.
* Например, для строки ""test abc"" необходимо получить строку ""abc test"".
*/
package practice.task2;

import java.util.StringJoiner;

public class WordUtils {
    private WordUtils() {}
    public static String reverseWords(String inputText) {
        if(inputText.isEmpty()) {
            return inputText;
        } else {
            String[] words = inputText.split(" ");
            StringJoiner outputText = new StringJoiner(" ");

            for(int i = words.length - 1; i >= 0; i--) {
                outputText.add(words[i]);
            }

            return outputText.toString();
        }
    }
}
