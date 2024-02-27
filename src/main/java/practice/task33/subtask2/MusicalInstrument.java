/*
* Описать класс для представления музыкальных инструментов с полями: название, тип (целое число), габариты, цена, год производства.
* Поле «габариты» реализовать в виде внутреннего класса с полями: width, height, depth.
* Также добавить вложенный статический класс для накопления статистики по инструментам: количество объектов по типам.
*/
package practice.task33.subtask2;

public class MusicalInstrument {
    private String title;
    private int type;
    private Dimensions dimensions;
    private int price;
    private int year;

    public MusicalInstrument(String title, int type, int width, int height, int depth, int price, int year) {
        this.title = title;
        this.type = type;
        dimensions = new Dimensions(width, height, depth);
        this.price = price;
        this.year = year;

        Stat.amountInstrument++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    class Dimensions {
        int width;
        int height;
        int depth;

        public Dimensions(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        @Override
        public String toString() {
            return "width=" + width +
                    ", height=" + height +
                    ", depth=" + depth;
        }
    }

    static class Stat {
        public static int amountInstrument = 0;
    }
}
