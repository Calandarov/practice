package practice.task36.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GraphTest {
    //TODO: написать тесты
    @Test
    public void createObject() {
        Graph graph = new Graph(2, "Graph");
        Graph lineGraph = new LineGraph(2, "lineGraph");
        Graph chart = new Chart(3, "Chart");
        Graph bar = new Bar(3, "Bar");

        graph.graphValues[0] = 1;
        graph.graphValues[1] = 2;

        lineGraph.graphValues[0] = 3;
        lineGraph.graphValues[1] = 4;

        chart.graphValues[0] = 5;
        chart.graphValues[1] = 6;
        chart.graphValues[2] = 7;

        bar.graphValues[0] = 8;
        bar.graphValues[1] = 9;
        bar.graphValues[2] = 10;

        graph.draw();
        lineGraph.draw();
        chart.draw();
        bar.draw();
    }
}
