/*
* Описать класс для представления музыкальных инструментов с полями: название, тип (целое число), габариты, цена, год производства.
* Поле «габариты» реализовать в виде внутреннего класса с полями: width, height, depth.
* Также добавить вложенный статический класс для накопления статистики по инструментам: количество объектов по типам.
*/
package practice.task33.subtask2;

public class MusicalInstrument {
    String title;
    int type;
    Dimensions dimensions;
    int price;
    int year;

    public MusicalInstrument(String title, int type, int width, int height, int depth, int price, int year) {
        this.title = title;
        this.type = type;
        dimensions = new Dimensions(width, height, depth);
        this.price = price;
        this.year = year;

        Stat.amountInstrument++;
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
