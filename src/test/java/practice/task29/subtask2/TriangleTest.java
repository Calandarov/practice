package practice.task29.subtask2;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void creatingObjectsWithDifferentConstructors() {
        Triangle constructorWithoutArg = new Triangle();
        Triangle constructorWithFourArg = new Triangle(1, 1, 2, 2,3, 1);

        System.out.println(constructorWithoutArg.getCoordinates());
        System.out.println(constructorWithFourArg.getCoordinates());
    }
}
