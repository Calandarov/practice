package practice.task36.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GraphTest {
    @Test
    public void checkPolymorphism() {
        Graph lineGraph = new LineGraph(2, "lineGraph");
        lineGraph.setGraphValues(new int[] {0, 1});

        Graph chart = new Chart(3, "Chart");
        chart.setGraphValues(new int[] {0, 1, 2});

        Graph bar = new Bar(3, "Bar");
        bar.setGraphValues(new int[] {3, 4, 5});

        Assertions.assertEquals("Рисуется график LineGraph со значениями [0, 1]", lineGraph.draw());
        Assertions.assertEquals("Рисуется график Chart со значениями [0, 1, 2]", chart.draw());
        Assertions.assertEquals("Рисуется график Bar со значениями [3, 4, 5]", bar.draw());
    }
}
