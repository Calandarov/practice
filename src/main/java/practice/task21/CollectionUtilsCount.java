/*
* Реализуйте метод, который принимает массив элементов
* и возвращает Map <K, Integer> где K - элемент массива, Integer — количество таких элементов в массиве
*/
package practice.task21;

import java.util.HashMap;
import java.util.Map;

public class CollectionUtilsCount {
    private CollectionUtilsCount() {}

    public static <K> Map<K, Integer> countElements(K[] inputArray) {
        Map<K, Integer> map = new HashMap<>();

        for(K item : inputArray) {
            int value = map.getOrDefault(item, 0) + 1;
            map.put(item, value);
        }

        return map;
    }
}
