/*
Объявить класс Line для представления линии на плоскости, хранящий две координаты: начало и конец линии.
Создать два объекта этого класса и в функции main() определить: пересекаются ли эти две линии.
*/
package practice.task29;

public class Line {
    private int startPointX;
    private int startPointY;
    private int endPointX;
    private int endPointY;

    public Line(int startPointX, int startPointY, int endPointX, int endPointY) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.endPointX = endPointX;
        this.endPointY = endPointY;
    }

    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    public int getEndPointX() {
        return endPointX;
    }

    public void setEndPointX(int endPointX) {
        this.endPointX = endPointX;
    }

    public int getEndPointY() {
        return endPointY;
    }

    public void setEndPointY(int endPointY) {
        this.endPointY = endPointY;
    }
}
