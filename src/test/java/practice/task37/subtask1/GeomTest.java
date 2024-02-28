package practice.task37.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GeomTest {
    @Test
    public void callingOverrideMethods() {
        Geom line = new Line(1, "Blue", 0, 1, 3, 1);
        Geom rect = new Rect(2, "Red", 0, 1, 3, 1);
        Geom ellipse = new Ellipse(1, "Green", 0, 1, 3, 1);

        Assertions.assertEquals("Нарисована линия с координатами: (0,1;3,1)", line.draw());
        Assertions.assertEquals("Нарисован прямоугольник с координатами: (0,1;3,1)", rect.draw());
        Assertions.assertEquals("Нарисован эллипс с координатами: (0,1;3,1)", ellipse.draw());
    }
}
