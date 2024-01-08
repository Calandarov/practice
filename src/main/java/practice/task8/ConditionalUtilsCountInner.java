/*
* Реализуйте метод, который принимает два положительных числа - двузначное и четырехзначное - и проверяет,
* сколько раз двузначное число встречается как «внутреннее» по отношению к четырехзначному.
*/
package practice.task8;

public class ConditionalUtilsCountInner {
    private ConditionalUtilsCountInner() {}

    public static int countInnerNumber(int base, int checkNumber) {
        String[] numbers = new String[] {String.valueOf(base).substring(0, 2),
                                         String.valueOf(base).substring(1, 3),
                                         String.valueOf(base).substring(2)};
        String innerNumber = String.valueOf(checkNumber);

        int count = 0;
        for(String number : numbers) {
            if(number.equals(innerNumber)) {
                count++;
            }
        }

        return count;
    }
}
