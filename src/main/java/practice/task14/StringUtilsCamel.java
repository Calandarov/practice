/*
* Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации.
* Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены.
* Пример: входная строка - my camel * case string 1, результат – myCamelCaseString
*/
package practice.task14;

import java.util.Arrays;

public class StringUtilsCamel {
    private StringUtilsCamel() {}

    public static String toCamelCase(String input) {
        StringBuilder builder = new StringBuilder();
        String str = input.replaceAll("[^A-Za-z]+", " ").trim();
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            String word = words[i];

            if(i == 0) {
                word = word.toLowerCase();
            } else {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            builder.append(word);
        }

        return builder.toString();
    }
}
