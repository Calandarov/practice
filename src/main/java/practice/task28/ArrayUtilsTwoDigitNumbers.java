/*
* Напишите метод, который получает в качестве параметра массив и заполняет его положительными случайными двузначными числами.
* Если в массиве уже присутствуют какие-либо значения - их необходимо удалить.
*/
package practice.task28;


import java.util.Random;

public class ArrayUtilsTwoDigitNumbers {
    private ArrayUtilsTwoDigitNumbers() {}

    public static int[] fillArrayByTwoDigitNumbers(int[] inputArray) {
        Random random = new Random();

        for(int i = 0; i < inputArray.length; i++) {
            int randomNum = random.nextInt(100);

            if(randomNum < 10) {
                inputArray[i] = randomNum + 10;
            } else {
                inputArray[i] = randomNum;
            }
        }

        return inputArray;
    }
}
