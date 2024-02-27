/*
* Реализовать класс Rect для описания прямоугольника с полями: x1, y1, x2, y2 – координат вершин верхнего правого и нижнего левого углов.
* Прописать два статических метода для вычисления ширины и высоты прямоугольника.
* В качестве параметра этим методам передавать ссылку на экземпляр класса Rect, для которого выполняется вычисление.
*/
package practice.task32.subtask2;

public class Rect {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    static int calculateWidth(Rect rect) {
        return rect.x1 - rect.x2;
    }

    static int calculateHeight(Rect rect) {
        return rect.y1;
    }
}
