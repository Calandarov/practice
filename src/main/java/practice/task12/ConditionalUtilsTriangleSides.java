/*
* Реализуйте метод, который принимает три числа и проверяет, могут ли они являться длинами сторон треугольника.
*/
package practice.task12;

public class ConditionalUtilsTriangleSides {
    private ConditionalUtilsTriangleSides() {}

    public static boolean isTriangleSides(int aSide, int bSide, int cSide) {
        return aSide < bSide + cSide && bSide < aSide + cSide && cSide < aSide + bSide;
    }
}
