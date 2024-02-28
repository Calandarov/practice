/*
* Реализовать метод заполнения массива числами из последовательности фибоначи начиная с 1, 2, ..., на вход приходит размерность массива
* Реализовать нужно с использованием цикла for
* Если размерность меньше нуля, создать пустой массив
* Если размерность равна нулю создать пустой массив
* Пример при длине 3 должен создаться массив [1, 2, 3]
*/
package practice.task13;

public class Repeat {
    private Repeat() {}

    public static int[] generateArr(int length) {
        if(length <= 0) {
            return new int[0];
        } else if(length == 1) {
            return new int[] {1};
        }

        int[] fibonacciNumbers = new int[length];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 2;

        for(int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }
}
