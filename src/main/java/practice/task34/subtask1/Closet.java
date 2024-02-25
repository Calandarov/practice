package practice.task34.subtask1;

public class Closet extends Furniture {
    private String handleMaterial;
    private int number;

    public Closet(String title, int height, int width, int depth, int price, String handleMaterial, int number) {
        super(title, height, width, depth, price);
        this.handleMaterial = handleMaterial;
        this.number = number;
    }

    public String getHandleMaterial() {
        return handleMaterial;
    }

    public void setHandleMaterial(String handleMaterial) {
        this.handleMaterial = handleMaterial;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
