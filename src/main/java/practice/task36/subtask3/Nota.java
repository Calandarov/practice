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
    private boolean isHaveSharp;
    private boolean isHaveFlat;

    public Nota(String id, String title, int duration, boolean isHaveSharp, boolean isHaveFlat) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.isHaveSharp = isHaveSharp;
        this.isHaveFlat = isHaveFlat;
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

    public final boolean isHaveSharp() {
        return isHaveSharp;
    }

    public final void setHaveSharp(boolean isHaveSharp) {
        this.isHaveSharp = isHaveSharp;
    }

    public final boolean isHaveFlat() {
        return isHaveFlat;
    }

    public final void setHaveFlat(boolean isHaveFlat) {
        this.isHaveFlat = isHaveFlat;
    }
}
