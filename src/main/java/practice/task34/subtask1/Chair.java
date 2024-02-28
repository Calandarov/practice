package practice.task34.subtask1;

public class Chair extends Furniture {
    private int numberOfLegs;
    private int heightOfLegs;
    private boolean chairBack;

    public Chair(String title, int height, int width, int depth, int price, int numberOfLegs, int heightOfLegs, boolean chairBack) {
        super(title, height, width, depth, price);
        this.numberOfLegs = numberOfLegs;
        this.heightOfLegs = heightOfLegs;
        this.chairBack = chairBack;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getHeightOfLegs() {
        return heightOfLegs;
    }

    public void setHeightOfLegs(int heightOfLegs) {
        this.heightOfLegs = heightOfLegs;
    }

    public boolean getChairBack() {
        return chairBack;
    }

    public void setChairBack(boolean chairBack) {
        this.chairBack = chairBack;
    }
}
