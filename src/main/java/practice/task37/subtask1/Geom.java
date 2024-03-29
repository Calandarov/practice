/*
* Объявите абстрактный класс Geom для представления геометрических фигур с полями:
* width, color для определения толщины и цвета линии,
* а также с абстрактным методом draw() для рисования конкретного графического примитива.
* Затем, запишите дочерние классы Line, Rect, Ellipse для представления линий, прямоугольников и эллипсов.
* Определите в них поля для хранения координат этих фигур и метод draw() для их рисования.
* Создайте обобщенные ссылки Geom на объекты дочерних классов и вызовите у них метод draw().
*/
package practice.task37.subtask1;

public abstract class Geom {
    protected int width;
    protected String color;

    public Geom(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public abstract String draw();
}
