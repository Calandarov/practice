/*
* Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации.
* Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены.
* Пример: входная строка - my camel * case string 1, результат – myCamelCaseString
*/
package practice.task14;

public class StringUtilsCamel {
    private StringUtilsCamel() {}

    public static String toCamelCase(String input) {
        StringBuilder builder = new StringBuilder();
        String[] words = input.split(" ");

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(i == 0) {
                word = word.toLowerCase();
            } else {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            builder.append(word);
            System.out.println(builder);
        }

        return builder.toString();
    }
}
