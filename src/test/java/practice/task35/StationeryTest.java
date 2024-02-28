package practice.task35;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class StationeryTest {
    @Test
    public void subtask1() {
        Notebook notebook = new Notebook(1000, true, 1, 14);
        Pen pen = new Pen(150, true, 2, "Blue");
        Pencil pencil = new Pencil(100, true, 3, false);

        System.out.println(notebook.displayNotebook());
        System.out.println(pen.displayPen());
        System.out.println(pencil.displayPencil());
    }

    @Test
    public void subtask2() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Notebook(1000, true, 4, 14));
        list.add(new Pen(150, true, 5, "Blue"));
        list.add(new Pencil(100, true, 6, false));

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
