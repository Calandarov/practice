/*
* Объявить класс Triangle, хранящий три координаты вершин.
* Координаты представить в виде ссылок на класс Point, который рассмотрен на этом занятии.
* Реализовать два конструктора: без аргументов и с шестью аргументами (по два на каждую координату).
* Создать два объекта, вывести координаты вершин по каждому объекту в консоль.
*/
package practice.task29.subtask2;

public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle() {
        a = new Point(0, 0);
        b = new Point(0, 0);
        c = new Point(0, 0);
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
    }

    public String getCoordinates() {
        return "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}
