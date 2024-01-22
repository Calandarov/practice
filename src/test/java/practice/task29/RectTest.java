package practice.task29;

import org.junit.Test;

public class RectTest {
    @Test
    public void creatingObjectsWithDifferentConstructors() {
        Rect constructorWithoutArg = new Rect();
        Rect constructorWithFourArg = new Rect(1, 1, 3, 3);

        System.out.println(constructorWithoutArg);
        System.out.println(constructorWithFourArg);
    }
}
