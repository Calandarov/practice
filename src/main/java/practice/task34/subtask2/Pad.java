package practice.task34.subtask2;

public class Pad extends DeviceScreen {
    String position;
    int screenSize;

    public Pad(String title, String font, boolean haveFrame, String position, int screenSize) {
        super(title, font, haveFrame);
        this.position = position;
        this.screenSize = screenSize;
    }
}
