package practice.task32.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RectTest {
    Rect rect = new Rect(3, 5, 0, 5);

    @Test
    public void calculateWidth() {
        System.out.println(Rect.calculateWidth(rect));
    }

    @Test
    public void calculateHeight() {
        System.out.println(Rect.calculateHeight(rect));
    }
}
