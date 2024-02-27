/*
* Дан массив целочисленных элементов.
* Реализуйте метод, который сдвигает все элементы массива, кроме первого, на одну позицию влево.
* Значение, находившееся в начальной ячейке массива, должно перейти в последнюю ячейку (левый сдвиг).
*/
package practice.task26;


public class ArrayUtilsShiftElements {
    private ArrayUtilsShiftElements() {}
    public static int[] shiftElements(int[] inputArray) {
        int firstElem = inputArray[0];
        int[] resultArr = new int[inputArray.length];

        for(int i = 0; i < inputArray.length; i++) {
            if(i == inputArray.length - 1) {
                resultArr[i] = firstElem;
            } else {
                resultArr[i] = inputArray[i + 1];
            }
        }

        return resultArr;
    }
}
