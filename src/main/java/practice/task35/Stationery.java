/*
* Объявите базовый класс Stationery для описания канцтоваров с полями: цена, наличие на складе, идентификатор.
* В этом классе реализовать два конструктора: без аргументов и с тремя аргументами для инициализации его полей.
* Затем, объявить производные от него классы для описания: ручек, карандашей, тетрадей.
* В дочерних классах реализовать несколько конструкторов с вызовом конструктора базового класса без аргументов и с аргументами.
* Также в производных классах придумайте разные поля (разные у разных классов) и пропишите методы в соответствующих классах:
* displayPen() – для отображения данных по ручкам;
* displayPencil() – для отображения данных по карандашам;
* displayNotebook() – для отображения данных по тетрадям.
* Создайте объекты дочерних классов и выведите информацию по ним в консоль.
*/
package practice.task35;

public class Stationery {
    protected int price;
    protected boolean stockAvailability;
    protected int id;

    public Stationery() {
        price = 0;
        stockAvailability = false;
        id = 0;
    }

    public Stationery(int price, boolean stockAvailability, int id) {
        this.price = price;
        this.stockAvailability = stockAvailability;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
