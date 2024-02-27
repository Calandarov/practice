package practice.task34.subtask1;

public class Closet extends Furniture {
    String handleMaterial;
    int number;

    public Closet(String title, int height, int width, int depth, int price, String handleMaterial, int number) {
        super(title, height, width, depth, price);
        this.handleMaterial = handleMaterial;
        this.number = number;
    }
}
