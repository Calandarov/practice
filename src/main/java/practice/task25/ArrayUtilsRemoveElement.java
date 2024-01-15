/*
* Реализуйте метод, который принимает массив целых чисел и одно целое число.
* А возвращает массив, в котором удалены все вхождения переданного числа
*/
package practice.task25;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsRemoveElement {
    private ArrayUtilsRemoveElement() {}
    public static int[] removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            if(num != val) {
                list.add(num);
            }
        }

        int[] resultArr = new int[list.size()];
        for(int i = 0; i < resultArr.length; i++) {
            resultArr[i] = list.get(i);
        }

        return resultArr;
    }
}
