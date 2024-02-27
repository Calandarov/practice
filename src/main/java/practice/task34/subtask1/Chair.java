package practice.task34.subtask1;

public class Chair extends Furniture {
    int numberOfLegs;
    int heightOfLegs;
    boolean isChairBack;

    public Chair(String title, int height, int width, int depth, int price, int numberOfLegs, int heightOfLegs, boolean isChairBack) {
        super(title, height, width, depth, price);
        this.numberOfLegs = numberOfLegs;
        this.heightOfLegs = heightOfLegs;
        this.isChairBack = isChairBack;
    }
}
