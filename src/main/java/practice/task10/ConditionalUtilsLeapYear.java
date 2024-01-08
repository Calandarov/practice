/*
* Реализуйте метод, который принимает номер года и проверяет високосный ли он или нет.
*/
package practice.task10;

public class ConditionalUtilsLeapYear {
    private ConditionalUtilsLeapYear() {}

    public static boolean isLeapYear(int inputYear) {
        boolean result = false;

        if(inputYear % 4 == 0 && inputYear % 100 != 0) {
            result = true;
        } else if(inputYear % 4 == 0 && inputYear % 100 == 0 && inputYear % 400 == 0) {
            result = true;
        }

        return result;
    }
}
