package practice.task30.subtask2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Vec2Test {
    Vec2 vec1;
    Vec2 vec2;
    @Test
    public void checkSummation() {
        vec1 = new Vec2(2, 0);
        vec2 = new Vec2(1, 3);

        Assertions.assertEquals(3, vec1.summation(vec2).getA());
        Assertions.assertEquals(3, vec1.summation(vec2).getB());
    }

    @Test
    public void checkSubtraction() {
        vec1 = new Vec2(3, 5);
        vec2 = new Vec2(0, 2);

        Assertions.assertEquals(3, vec1.subtraction(vec2).getA());
        Assertions.assertEquals(3, vec1.subtraction(vec2).getB());
    }
}
