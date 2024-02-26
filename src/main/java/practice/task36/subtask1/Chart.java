package practice.task36.subtask1;

import java.util.Arrays;

public class Chart extends Graph {
    public Chart(int graphValuesLength, String title) {
        super(graphValuesLength, title);
    }

    @Override
    public void draw() {
        System.out.println("Рисуется график Chart со значениями " + Arrays.toString(graphValues));
    }
}
