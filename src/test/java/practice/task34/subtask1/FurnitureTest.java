package practice.task34.subtask1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurnitureTest {
    Chair chair;
    Closet closet;
    Shelf shelf;
    Table table;

    @Test
    public void createChair() {
        chair = new Chair("Chair", 10, 10, 30, 1500, 4, 15, true);

        Assertions.assertEquals("Chair", chair.getTitle());
        Assertions.assertEquals(10, chair.getHeight());
        Assertions.assertEquals(10, chair.getWidth());
        Assertions.assertEquals(30, chair.getDepth());
        Assertions.assertEquals(1500, chair.getPrice());
        Assertions.assertEquals(4, chair.getNumberOfLegs());
        Assertions.assertEquals(15, chair.getHeightOfLegs());
        Assertions.assertTrue(chair.getChairBack());
    }

    @Test
    public void createCloset() {
        closet = new Closet("Closet", 150, 150, 200, 5000, "Material", 10);

        Assertions.assertEquals("Closet", closet.getTitle());
        Assertions.assertEquals(150, closet.getHeight());
        Assertions.assertEquals(150, closet.getWidth());
        Assertions.assertEquals(200, closet.getDepth());
        Assertions.assertEquals(5000, closet.getPrice());
        Assertions.assertEquals("Material", closet.getHandleMaterial());
        Assertions.assertEquals(10, closet.getNumber());
    }

    @Test
    public void createShelf() {
        shelf = new Shelf("Shelf", 20, 20, 10, 40, 5, 5);

        Assertions.assertEquals("Shelf", shelf.getTitle());
        Assertions.assertEquals(20, shelf.getHeight());
        Assertions.assertEquals(20, shelf.getWidth());
        Assertions.assertEquals(10, shelf.getDepth());
        Assertions.assertEquals(40, shelf.getPrice());
        Assertions.assertEquals(5, shelf.getNumberOfSegments());
        Assertions.assertEquals(5, shelf.getSegmentSize());
    }

    @Test
    public void createTable() {
        table = new Table("Table", 40, 35, 20, 1000, 4, 35);

        Assertions.assertEquals("Table", table.getTitle());
        Assertions.assertEquals(40, table.getHeight());
        Assertions.assertEquals(35, table.getWidth());
        Assertions.assertEquals(20, table.getDepth());
        Assertions.assertEquals(1000, table.getPrice());
        Assertions.assertEquals(4, table.getNumberOfLegs());
        Assertions.assertEquals(35, table.getArea());
    }
}
