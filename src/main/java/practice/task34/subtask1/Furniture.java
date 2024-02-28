/*
* Объявите классы для описания мебели: стулья, шкафы, полки, столы. У этих классов имеются общие поля: название, габариты, цена.
* И уникальные для каждого объекта:
* для стула: число ножек, высота ножек, наличие спинки;
* для шкафов: материал ручек, число створок и шкафчиков;
* для полок: число сегментов и размер каждого сегмента;
* для столов: число ножек и площадь столешницы.
* Подумайте, как описать эти объекты. Создайте их и выведите значение полей в консоль.
*/
package practice.task34.subtask1;

public class Furniture {
    protected String title;
    protected int height;
    protected int width;
    protected int depth;
    protected int price;

    public Furniture(String title, int height, int width, int depth, int price) {
        this.title = title;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
