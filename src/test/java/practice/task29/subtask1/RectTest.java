package practice.task29.subtask1;

import org.junit.Test;

public class RectTest {
    @Test
    public void createObjectsWithDifferentConstructors() {
        Rect constructorWithoutArg = new Rect();
        Rect constructorWithFourArg = new Rect(1, 1, 3, 3);

        System.out.println(constructorWithoutArg.getCoordinates());
        System.out.println(constructorWithFourArg.getCoordinates());
    }
}
