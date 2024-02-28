package practice.task36.subtask1;

import java.util.Arrays;

public class Chart extends Graph {
    public Chart(int graphValuesLength, String title) {
        super(graphValuesLength, title);
    }

    @Override
    public String draw() {
        return "Рисуется график Chart со значениями " + Arrays.toString(graphValues);
    }
}
