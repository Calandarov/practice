/*
* Дано число. Реализуйте метод, который вычисляет числа Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...),
* находит их сумму и возвращает её в виде строки.
* Формула расчёта чисел: Fn = Fn-1 + Fn-2 - где n переданное в метод число.
* Например для n=5 сумма будет равна 7, а для n=2 сумма будет равна 1.
* Если в метод передано отрицательное число - он должен вернуть 0..
*/
package practice.task4;


import java.util.Arrays;

public class FibonacciUtils {
    private FibonacciUtils() {}
    public static String getFibonacciSum(byte limit) {
        if(limit < 0) {
            return "0";
        }

        byte fibonacciSum = 0;
        byte[] fibonacciNumbers = new byte[limit];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for(int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = (byte) (fibonacciNumbers[i - 1] + fibonacciNumbers[i-2]);
        }

        for(int i = 0; i < fibonacciNumbers.length; i++) {
            fibonacciSum += fibonacciNumbers[i];
        }

        System.out.println(Arrays.toString(fibonacciNumbers));

        return String.valueOf(fibonacciSum);
    }
}
