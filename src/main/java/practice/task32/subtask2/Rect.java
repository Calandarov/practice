/*
* Реализовать класс Rect для описания прямоугольника с полями: x1, y1, x2, y2 – координат вершин верхнего правого и нижнего левого углов.
* Прописать два статических метода для вычисления ширины и высоты прямоугольника.
* В качестве параметра этим методам передавать ссылку на экземпляр класса Rect, для которого выполняется вычисление.
*/
package practice.task32.subtask2;

public class Rect {
    int x1;
    int y1;
    int x2;
    int y2;

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    static int calculateWidth(Rect rect) {
        return rect.x1 - rect.x2;
    }

    static int calculateHeight(Rect rect) {
        return rect.y1;
    }
}
