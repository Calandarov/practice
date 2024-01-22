package practice.task29;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void creatingObjectsWithDifferentConstructors() {
        Triangle constructorWithoutArg = new Triangle();
        Triangle constructorWithFourArg = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 1));

        System.out.println(constructorWithoutArg);
        System.out.println(constructorWithFourArg);
    }
}
