/*
* Объявите класс ShopItem для представления продуктов в магазине с полями:
* id (идентификатор – целое число), название товара, габариты, вес, цена.
* Поле id должно быть уникальным для каждого объекта класса.
* Это следует реализовать через статическую переменную, которая подсчитывает количество создаваемых экземпляров.
*/
package practice.task32.subtask1;

public class ShopItem {
    static int amountShopItem = 0;
    int id = 0;
    String title;
    int width;
    int height;
    int length;
    int mass;
    int price;

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
}
