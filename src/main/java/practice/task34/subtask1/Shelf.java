package practice.task34.subtask1;

import practice.task34.subtask1.Furniture;

public class Shelf extends Furniture {
    private int numberOfSegments;
    private int segmentSize;

    public Shelf(String title, int height, int width, int depth, int price, int numberOfSegments, int segmentSize) {
        super(title, height, width, depth, price);
        this.numberOfSegments = numberOfSegments;
        this.segmentSize = segmentSize;
    }

    public int getNumberOfSegments() {
        return numberOfSegments;
    }

    public void setNumberOfSegments(int numberOfSegments) {
        this.numberOfSegments = numberOfSegments;
    }

    public int getSegmentSize() {
        return segmentSize;
    }

    public void setSegmentSize(int segmentSize) {
        this.segmentSize = segmentSize;
    }
}
