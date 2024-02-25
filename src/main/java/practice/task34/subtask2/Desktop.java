package practice.task34.subtask2;

public class Desktop extends DeviceScreen {
    private String position;
    private int screenSize;
    private boolean abilityToChangeSize;
    private boolean fullScreen;

    public Desktop(String title, String font, boolean haveFrame, String position, int screenSize, boolean abilityToChangeSize, boolean fullScreen) {
        super(title, font, haveFrame);
        this.position = position;
        this.screenSize = screenSize;
        this.abilityToChangeSize = abilityToChangeSize;
        this.fullScreen = fullScreen;
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

    public boolean isAbilityToChangeSize() {
        return abilityToChangeSize;
    }

    public void setAbilityToChangeSize(boolean abilityToChangeSize) {
        this.abilityToChangeSize = abilityToChangeSize;
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }
}
