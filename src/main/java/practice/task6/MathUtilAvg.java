/*
* Даны 2 числа.
* Реализуйте метод, который вычисляет все чётные числа между переданными числами и выводит из них среднее значение.
* Если получается дробное значение метод должен округлить число до целого в меньшую сторону.
* Если хотя бы одно число из переданных является отрицательным метод должен вернуть 0.
* Первое переданное число должно быть всегда меньше второго иначе метод должен вернуть 0.
*/
package practice.task6;

public class MathUtilAvg {
    private MathUtilAvg() {}
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        if((lowEdge < 0 || highEdge < 0) || (lowEdge > highEdge)) {
            return 0;
        }

        int sum = 0;
        int count = 0;
        for(int i = lowEdge; i <= highEdge; i++) {
            if(i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        return (sum / count);
    }
}
