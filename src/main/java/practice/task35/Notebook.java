package practice.task35;

public class Notebook extends Stationery {
    private int screenSize;

    public Notebook() {
        super();
        screenSize = 0;
    }

    public Notebook(int price, boolean stockAvailability, int id, int screenSize) {
        super(price, stockAvailability, id);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String displayNotebook() {
        return "Notebook{" +
                "screenSize=" + screenSize +
                ", price=" + price +
                ", stockAvailability=" + stockAvailability +
                ", id=" + id +
                '}';
    }
}
