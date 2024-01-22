/*
* Объявить класс Triangle, хранящий три координаты вершин.
* Координаты представить в виде ссылок на класс Point, который рассмотрен на этом занятии.
* Реализовать два конструктора: без аргументов и с шестью аргументами (по два на каждую координату).
* Создать два объекта, вывести координаты вершин по каждому объекту в консоль.
*/
package practice.task29;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        a = new Point(0, 0);
        b = new Point(0, 0);
        c = new Point(0, 0);
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return this.a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "a=" + a.getX() + "," + a.getY()
                + " b=" + b.getX() + "," + b.getY()
                + " c=" + c.getX() + "," + c.getY()
                + "}";
    }
}
