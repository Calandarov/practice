package practice.task37.subtask1;

import org.junit.Assert;
import org.junit.Test;

public class GeomTest {
    // TODO: переделать в нормальный вид
    @Test
    public void createObjects() {
        Geom line = new Line(1, "Blue", 0, 1, 3, 1);
        Geom rect = new Rect(2, "Red", 0, 1, 3, 1);
        Geom ellipse = new Ellipse(1, "Green", 0, 1, 3, 1);

        String expectedLine = "Нарисована линия с координатами: (0,1;3,1)";
        String expectedRect = "Нарисован прямоугольник с координатами: (0,1;3,1)";
        String expectedEllipse = "Нарисован эллипс с координатами: (0,1;3,1)";

        Assert.assertEquals(expectedLine, line.draw());
        Assert.assertEquals(expectedRect, rect.draw());
        Assert.assertEquals(expectedEllipse, ellipse.draw());
    }
}