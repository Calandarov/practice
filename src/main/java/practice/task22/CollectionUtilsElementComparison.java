/*
* Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов
*/
package practice.task22;

import java.util.HashSet;
import java.util.List;

public class CollectionUtilsElementComparison {
    private CollectionUtilsElementComparison() {}

    public static boolean isValuesMatch(List<?> leftList, List<?> rightList) {
        return new HashSet<>(leftList).equals(new HashSet<>(rightList));
    }
}
