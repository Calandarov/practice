package practice.task36.subtask1;

import java.util.Arrays;

public class LineGraph extends Graph {
    public LineGraph(int graphValuesLength, String title) {
        super(graphValuesLength, title);
    }

    @Override
    public String draw() {
        return "Рисуется график LineGraph со значениями " + Arrays.toString(graphValues);
    }
}
