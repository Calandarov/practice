package practice.task35;

public class Pen extends Stationery {
    private String color;

    public Pen() {
        super();
        color = null;
    }

    public Pen(int price, boolean stockAvailability, int id, String color) {
        super(price, stockAvailability, id);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String displayPen() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", stockAvailability=" + stockAvailability +
                ", id=" + id +
                '}';
    }
}
