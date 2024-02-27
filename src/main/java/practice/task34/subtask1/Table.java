package practice.task34.subtask1;

import practice.task34.subtask1.Furniture;

public class Table extends Furniture {
    int numberOfLegs;
    int area;

    public Table(String title, int height, int width, int depth, int price, int numberOfLegs, int area) {
        super(title, height, width, depth, price);
        this.numberOfLegs = numberOfLegs;
        this.area = area;
    }
}
