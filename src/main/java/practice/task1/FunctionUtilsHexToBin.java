/*
* Реализуйте метод, который из переданного шестнадцатиричного числа возвращает двоичное.
*/
package practice.task1;

public class FunctionUtilsHexToBin {
    public static String hexToBin(String hexBase) {
        return Integer.toBinaryString(Integer.parseInt(hexBase, 16));
    }
}
