package practice.task35;

public class Pencil extends Stationery {
    private boolean haveEraser;

    public Pencil() {
        super();
        haveEraser = false;
    }

    public Pencil(int price, boolean stockAvailability, int id, boolean haveEraser) {
        super(price, stockAvailability, id);
        this.haveEraser = haveEraser;
    }

    public boolean isHaveEraser() {
        return haveEraser;
    }

    public void setHaveEraser(boolean haveEraser) {
        this.haveEraser = haveEraser;
    }

    public String displayPencil() {
        return "Pencil{" +
                "haveEraser=" + haveEraser +
                ", price=" + price +
                ", stockAvailability=" + stockAvailability +
                ", id=" + id +
                '}';
    }
}
