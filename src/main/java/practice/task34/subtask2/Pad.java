package practice.task34.subtask2;

public class Pad extends DeviceScreen {
    private String position;
    private int screenSize;

    public Pad(String title, String font, boolean haveFrame, String position, int screenSize) {
        super(title, font, haveFrame);
        this.position = position;
        this.screenSize = screenSize;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
