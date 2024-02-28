/*
* Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов
*/
package practice.task22;

import java.util.List;
import java.util.ArrayList;

public class CollectionUtilsElementComparison {
    private CollectionUtilsElementComparison() {}

    public static boolean compareElements(List<?> leftList, List<?> rightList) {
        return new ArrayList<>(leftList).equals(new ArrayList<>(rightList));
    }
}
