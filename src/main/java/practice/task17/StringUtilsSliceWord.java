/* Дана строка, реализуйте метод, который позволяет получать подстроку по заданным индексам
* Пример getSlice(""Test"", 1, 4) - вернёт ""est""
*/
package practice.task17;

public class StringUtilsSliceWord {
    private StringUtilsSliceWord() {}

    public static String getSlice(String input, int leftEdge, int rightEdge) {
        return  input.substring(leftEdge, rightEdge);
    }
}
