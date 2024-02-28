package practice.task34.subtask2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeviceScreenTest {
    Desktop desktop;
    Pad pad;
    Smartphone smartphone;

    @Test
    public void createDesktop() {
        desktop = new Desktop("Desktop", "desktopFont", true, "desktopPosition", 10, true, false);

        Assertions.assertEquals("Desktop", desktop.getTitle());
        Assertions.assertEquals("desktopFont", desktop.getFont());
        Assertions.assertTrue(desktop.getHaveFrame());
        Assertions.assertEquals("desktopPosition", desktop.getPosition());
        Assertions.assertEquals(10, desktop.getScreenSize());
        Assertions.assertTrue(desktop.getAbilityToChangeSize());
        Assertions.assertFalse(desktop.getFullScreen());
    }

    @Test
    public void createPad() {
        pad = new Pad("Pad", "padFont", false, "padPosition", 5);

        Assertions.assertEquals("Pad", pad.getTitle());
        Assertions.assertEquals("padFont", pad.getFont());
        Assertions.assertFalse(pad.getHaveFrame());
        Assertions.assertEquals("padPosition", pad.getPosition());
        Assertions.assertEquals(5, pad.getScreenSize());
    }

    @Test
    public void createSmartphone() {
        smartphone = new Smartphone("Smartphone", "smartphoneSize", false);

        Assertions.assertEquals("Smartphone", smartphone.getTitle());
        Assertions.assertEquals("smartphoneSize", smartphone.getFont());
        Assertions.assertFalse(smartphone.getHaveFrame());
    }
}
