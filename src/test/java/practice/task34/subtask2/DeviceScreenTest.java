package practice.task34.subtask2;

import org.junit.Test;

public class DeviceScreenTest {
    @Test
    public void createObject() {
        Desktop desktop = new Desktop("Desktop", "desktopFont", true, "desktopPosition", 10, true, false);
        Pad pad = new Pad("Pad", "padFont", false, "padPosition", 5);
        Smartphone smartphone = new Smartphone("Smartphone", "smartphoneSize", false);

        System.out.println(desktop.title + " " + desktop.getScreenSize());
        System.out.println(pad.title + " " + pad.getPosition());
        System.out.println(smartphone.title + " " + smartphone.font);
    }
}
