package practice.task35;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class StationeryTest {
    Notebook notebook;
    Pen pen;
    Pencil pencil;

    @DisplayName("subtask1")
    @Test
    public void getChildObjectsData() {
        notebook = new Notebook(1000, true, 1, 14);
        pen = new Pen(150, true, 2, "Blue");
        pencil = new Pencil(100, true, 3, false);

        Assertions.assertEquals("Notebook{screenSize=14, price=1000, stockAvailability=true, id=1}", notebook.displayNotebook());
        Assertions.assertEquals("Pen{color='Blue', price=150, stockAvailability=true, id=2}", pen.displayPen());
        Assertions.assertEquals("Pencil{haveEraser=false, price=100, stockAvailability=true, id=3}", pencil.displayPencil());
    }

    @DisplayName("subtask2")
    @Test
    public void getChildObjectsDataFromArrayList() {
        notebook = new Notebook(1000, true, 4, 14);
        pen = new Pen(150, true, 5, "Blue");
        pencil = new Pencil(100, true, 6, false);

        ArrayList<Object> list = new ArrayList<>();
        list.add(notebook);
        list.add(pen);
        list.add(pencil);

        for(Object item : list) {
            if(item instanceof Notebook) {
                System.out.println(((Notebook) item).displayNotebook());
            }

            if(item instanceof Pen) {
                System.out.println(((Pen) item).displayPen());
            }

            if(item instanceof Pencil) {
                System.out.println(((Pencil) item).displayPencil());
            }
        }
    }
}
