package practice.task34.subtask1;

import org.junit.Test;

public class FurnitureTest {
    @Test
    public void createObject() {
        Chair chair = new Chair("Chair", 10, 10, 30, 1500, 4, 15, true);
        Closet closet = new Closet("Closet", 150, 150, 200, 5000, "Material", 10);
        Shelf shelf = new Shelf("Shelf", 20, 20, 10, 40, 5, 5);
        Table table = new Table("Table", 40, 35, 20, 1000, 4, 35);

        System.out.println(chair.title + " " + chair.getNumberOfLegs());
        System.out.println(closet.title + " " + closet.getHandleMaterial());
        System.out.println(shelf.title + " " + shelf.getNumberOfSegments());
        System.out.println(table.title + " " + table.getArea());
    }
}
