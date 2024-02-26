package practice.task37.subtask1;

public class Ellipse extends Geom {
    private int x;
    private int y;
    private int a;
    private int b;

    public Ellipse(int width, String color, int x, int y, int a, int b) {
        super(width, color);
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String draw() {
        return "Нарисован эллипс с координатами: (" + x + "," + y + ";" + a + "," + b + ")";
    }
}
