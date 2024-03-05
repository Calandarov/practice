/*
* Создайте базовый класс Nota для описания музыкальных нот с полями: идентификатор, название, длительность, наличие диеза, наличие бемоля.
* Все поля должны быть закрыты и не наследоваться в дочерних классах.
* Работа с ними должна осуществляться через сеттеры и геттеры, которые запретить для переопределения в дочерних классах.
* Добавить определения дочерних классов для нот: до, ре, ми, фа, соль, ля, си.
* Создать их экземпляры и вывести информацию по ним в консоль.
*/
package practice.task36.subtask3;

public class Nota {
    private String id;
    private String title;
    private int duration;
    private boolean sharp;
    private boolean flat;

    public Nota(String id, String title, int duration, boolean sharp, boolean flat) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.sharp = sharp;
        this.flat = flat;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final int getDuration() {
        return duration;
    }

    public final void setDuration(int duration) {
        this.duration = duration;
    }

    public final boolean getSharp() {
        return sharp;
    }

    public final void setSharp(boolean sharp) {
        this.sharp = sharp;
    }

    public final boolean getFlat() {
        return flat;
    }

    public final void setFlat(boolean flat) {
        this.flat = flat;
    }
}
