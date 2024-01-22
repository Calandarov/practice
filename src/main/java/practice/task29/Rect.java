/*
* Объявить класс Rect для представления прямоугольника, в котором хранятся две координаты: верхнего левого и правого нижнего углов.
* Реализовать три конструктора: первый – без аргументов;
* второй с четырьмя аргументами для двух координат;
* третий – с четырьмя аргументами (координата левого верхнего угла, ширина и высота).
* Создать несколько экземпляров с вызовом разных конструкторов и выводом значений полей в консоль.
*/
package practice.task29;

public class Rect {
    private int topLeftCornerX;
    private int topLeftCornerY;
    private int botRightCornerX;
    private int botRightCornerY;

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

//    public Rect(int topLeftCornerX, int topLeftCornerY, int width, int height) {
//        this.topLeftCornerX = topLeftCornerX;
//        this.topLeftCornerY = topLeftCornerY;
//        this.botRightCornerX = width;
//        this.botRightCornerY = height;
//    }

    public int getTopLeftCornerX() {
        return topLeftCornerX;
    }

    public void setTopLeftCornerX(int topLeftCornerX) {
        this.topLeftCornerX = topLeftCornerX;
    }

    public int getTopLeftCornerY() {
        return topLeftCornerY;
    }

    public void setTopLeftCornerY(int topLeftCornerY) {
        this.topLeftCornerY = topLeftCornerY;
    }

    public int getBotRightCornerX() {
        return botRightCornerX;
    }

    public void setBotRightCornerX(int botRightCornerX) {
        this.botRightCornerX = botRightCornerX;
    }

    public int getBotRightCornerY() {
        return botRightCornerY;
    }

    public void setBotRightCornerY(int botRightCornerY) {
        this.botRightCornerY = botRightCornerY;
    }

    @Override
    public String toString() {
        return "Rect{"
                + "topLeftCornerX=" + topLeftCornerX
                + ", topLeftCornerY=" + topLeftCornerY
                + ", botRightCornerX=" + botRightCornerX
                + ", botRightCornerY=" + botRightCornerY
                + "}";
    }
}
