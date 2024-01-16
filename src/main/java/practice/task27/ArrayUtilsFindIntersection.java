/*
* Даны два массива с целочисленными элементами.
* Напишите метод, который возвращает массив со смежными элементами (их пересечение).
* Если пересечений нет,метод должен вернуть пустой массив
*/
package practice.task27;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsFindIntersection {
    private ArrayUtilsFindIntersection() {}

    public static int[] findIntersection(int[] rightArray, int[] leftArray) {
        List<Integer> list = new ArrayList<>();

        for(int i : rightArray) {
            for(int j : leftArray) {
                if(i == j) {
                    list.add(i);
                }
            }
        }

        if(!list.isEmpty()) {
            int[] resultArr = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                resultArr[i] = list.get(i);
            }

            return resultArr;
        }

        return new int[0];
    }
}
