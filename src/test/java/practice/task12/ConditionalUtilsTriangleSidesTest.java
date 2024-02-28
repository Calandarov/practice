package practice.task12;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalUtilsTriangleSidesTest {
    @Test
    public void isTriangleSides() {
        Assertions.assertTrue(ConditionalUtilsTriangleSides.isTriangleSides(10,7,12));
        Assertions.assertTrue(ConditionalUtilsTriangleSides.isTriangleSides(5,7,10));
    }

    @Test
    public void isNotTriangleSides() {
        Assertions.assertFalse(ConditionalUtilsTriangleSides.isTriangleSides(1,2,3));
        Assertions.assertFalse(ConditionalUtilsTriangleSides.isTriangleSides(3,4,8));
    }
}
