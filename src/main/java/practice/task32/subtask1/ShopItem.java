/*
* Объявите класс ShopItem для представления продуктов в магазине с полями:
* id (идентификатор – целое число), название товара, габариты, вес, цена.
* Поле id должно быть уникальным для каждого объекта класса.
* Это следует реализовать через статическую переменную, которая подсчитывает количество создаваемых экземпляров.
*/
package practice.task32.subtask1;

public class ShopItem {
    static int amountShopItem = 0;
    private int id;
    private String title;
    private int width;
    private int height;
    private int length;
    private int mass;
    private int price;

    public ShopItem(String title, int width, int height, int length, int mass, int price) {
        id = amountShopItem++;
        this.title = title;
        this.width = width;
        this.height = height;
        this.length = length;
        this.mass = mass;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
