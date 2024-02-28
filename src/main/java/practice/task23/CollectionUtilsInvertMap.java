/*
* Реализуйте метод, принимающий Map<K, V> и возвращающий Map, в котором ключи и значения поменяны местами.
*/
package practice.task23;

import java.util.HashMap;
import java.util.Map;

public class CollectionUtilsInvertMap {
    private CollectionUtilsInvertMap() {}

    public static <K, V> Map<V, K> reverseMap(Map<? extends K, ? extends V> inputMap) {
        Map<V, K> map = new HashMap<>();

        for(Map.Entry<? extends K , ? extends V> entry : inputMap.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }

        return map;
    }
}
