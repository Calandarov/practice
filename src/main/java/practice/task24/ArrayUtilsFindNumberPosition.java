/*
* Напишите метод, который получает в качестве параметров двумерный массив целых чисел и целое число.
* Метод возвращает массив из двух элементов - номера строки и колонки, по которым располагается переданное число.
* Если число не обнаружено - вывести пустой массив. Если таких чисел несколько вывести последнее.
*/
package practice.task24;

public class ArrayUtilsFindNumberPosition {
    private ArrayUtilsFindNumberPosition() {}

    public static int[] findNumberPosition(int[][] input, int number) {
        int[] result = null;

        for(int i = 0; i < input.length; i++) {
            int innerLength = input[i].length;

            for(int j = 0; j < innerLength; j++) {
                if(input[i][j] == number) {
                    result = new int[]{i, j};
                }
            }
        }

        return result;
    }
}
