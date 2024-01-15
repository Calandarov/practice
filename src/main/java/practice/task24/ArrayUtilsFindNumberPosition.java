/*
* Напишите метод, который получает в качестве параметров двумерный массив целых чисел и целое число.
* Метод возвращает массив из двух элементов - номера строки и колонки, по которым располагается переданное число.
* Если число не обнаружено - вывести пустой массив. Если таких чисел несколько вывести последнее.
*/
package practice.task24;


public class ArrayUtilsFindNumberPosition {
    private ArrayUtilsFindNumberPosition() {}

    public static int[] findNumberPosition(int[][] input, int number) {
        boolean match = false;
        int raw = 0;
        int col = 0;

        for(int i = 0; i < input.length; i++) {
            int innerLength = input[i].length;

            for(int j = 0; j < innerLength; j++) {
                if(input[i][j] == number) {
                    match = true;
                    raw = i;
                    col = j;
                }
            }
        }

        if(match) {
            return new int[] {raw, col};
        }

        return new int[0];
    }
}
