/*
* Объявить класс Rect для представления прямоугольника, в котором хранятся две координаты: верхнего левого и правого нижнего углов.
* Реализовать три конструктора: первый – без аргументов;
* второй с четырьмя аргументами для двух координат;
* третий – с четырьмя аргументами (координата левого верхнего угла, ширина и высота).
* Создать несколько экземпляров с вызовом разных конструкторов и выводом значений полей в консоль.
*/
package practice.task29.subtask1;

public class Rect {
    int topLeftCornerX;
    int topLeftCornerY;
    int botRightCornerX;
    int botRightCornerY;

    public Rect() {
        topLeftCornerX = 0;
        topLeftCornerY = 0;
        botRightCornerX = 0;
        botRightCornerY = 0;
    }
    public Rect(int topLeftCornerX, int topLeftCornerY, int botRightCornerX, int botRightCornerY) {
        this.topLeftCornerX = topLeftCornerX;
        this.topLeftCornerY = topLeftCornerY;
        this.botRightCornerX = botRightCornerX;
        this.botRightCornerY = botRightCornerY;
    }

    // TODO: посмотреть еще
//    public Rect(int topLeftCornerX, int topLeftCornerY, int width, int height) {
//        this.topLeftCornerX = topLeftCornerX;
//        this.topLeftCornerY = topLeftCornerY;
//        this.botRightCornerX = width;
//        this.botRightCornerY = height;
//    }

    public String getCoordinates() {
        return "(" +
                topLeftCornerX +
                "," +
                topLeftCornerY +
                ";" +
                botRightCornerX +
                "," +
                botRightCornerY +
                ")";
    }
}
