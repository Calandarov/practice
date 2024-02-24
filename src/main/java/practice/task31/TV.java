/*
* Объявите класс для хранения информации по телевизорам с полями: марка, размер диагонали, год производства, цена.
* Доступ к данным реализовать через сеттеры и геттеры.
* Определить минимум два конструктора: первый должен только инициализировать данные, другие – создавать новый объект с разными аргументами.
* Запретить создавать объект без аргументов.
*/
package practice.task31;

public class TV {
    private String mark;
    private int size;
    private int diagonal;
    private int year;
    private int price;

    private TV() {
        mark = "LG";
        size = 100;
        diagonal = 65;
        year = 2024;
        price = 1000;
    }
    public TV(String mark, int size, int diagonal, int year, int price) {
        this.mark = mark;
        this.size = size;
        this.diagonal = diagonal;
        this.year = year;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
