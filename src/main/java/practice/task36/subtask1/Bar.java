package practice.task36.subtask1;

import java.util.Arrays;

public class Bar extends Graph {
    public Bar(int graphValuesLength, String title) {
        super(graphValuesLength, title);
    }

    @Override
    public void draw() {
        System.out.println("Рисуется график Bar со значениями " + Arrays.toString(graphValues));
    }
}
