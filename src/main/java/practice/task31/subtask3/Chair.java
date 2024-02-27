/*
* Создать новый пакет и определить в нем класс Chair для описания стульев с полями: габариты, цена, производитель, год производства.
* Доступ к данным реализовать через сеттеры и геттеры.
* Добавить метод вычисления объема стула по его габаритам.
* В основном классе проекта импортировать этот класс, создать несколько его экземпляров и вывести габариты и объемы стульев в консоль.
*/
package practice.task31.subtask3;

public class Chair {
    private int width;
    private int height;
    private int length;
    private int price;
    private String manufacturer;
    private int year;

    public Chair(int width, int height, int length, int price, String manufacturer, int year) {
        this.width = width;
        this.height = height;
        this.length = length;
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
