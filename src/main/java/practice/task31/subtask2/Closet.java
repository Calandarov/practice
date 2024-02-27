/*
* В отдельном файле текущего пакета объявить класс для описания шкафов с полями: габариты, тип шкафа, цена, производитель, год производства.
* Прописать геттеры и сеттеры для доступа к полям класса.
* Добавить конструкторы для создания объектов.
* Запретить создавать объект без указания аргументов.
* Добавить метод для вычисления объема шкафа по его габаритам.
* В основном классе (в функции main()) создать несколько экземпляров класса шкафов и вывести в консоль их габариты и объемы.
*/
package practice.task31.subtask2;

public class Closet {
    private int width;
    private int height;
    private int length;
    private String type;
    private int price;
    private String manufacturer;
    private int year;

    public Closet(int width, int height, int length, String type, int price, String manufacturer, int year) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.type = type;
        this.price = price;
        this.manufacturer = manufacturer;
        this.year = year;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int calculateSize() {
        return width * height * length;
    }
}
