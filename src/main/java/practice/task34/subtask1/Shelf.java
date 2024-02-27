package practice.task34.subtask1;

import practice.task34.subtask1.Furniture;

public class Shelf extends Furniture {
    int numberOfSegments;
    int segmentSize;

    public Shelf(String title, int height, int width, int depth, int price, int numberOfSegments, int segmentSize) {
        super(title, height, width, depth, price);
        this.numberOfSegments = numberOfSegments;
        this.segmentSize = segmentSize;
    }
}
