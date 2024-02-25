/*
* Объявите класс ShopItem для представления продуктов в магазине с полями:
* id (идентификатор – целое число), название товара, габариты, вес, цена.
* Поле id должно быть уникальным для каждого объекта класса.
* Это следует реализовать через статическую переменную, которая подсчитывает количество создаваемых экземпляров.
*/
package practice.task32;

public class ShopItem {
    public static int amountShopItem = 0;
    private int id = 0;
    private String title = null;
    private int width = 0;
    private int height = 0;
    private int length = 0;
    private int mass = 0;
    private int price = 0;

    public ShopItem(String title, int width, int height, int length, int mass, int price) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.length = length;
        this.mass = mass;
        this.price = price;

        id++;
        amountShopItem++;
    }

    public static int getAmountShopItem() {
        return amountShopItem;
    }

    public static void setAmountShopItem(int amountShopItem) {
        ShopItem.amountShopItem = amountShopItem;
    }

    public int getId() {
        return id;
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
