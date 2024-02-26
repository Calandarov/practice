package practice.task36.subtask1;

import org.junit.Test;

public class GraphTest {
    @Test
    public void createObject() {
        Graph graph = new Graph(2, "Граф");
        Graph lineGraph = new LineGraph(2, "Линия");

        graph.graphValues[0] = 1;
        graph.graphValues[1] = 2;

        lineGraph.graphValues[0] = 3;
        lineGraph.graphValues[1] = 4;

        graph.draw();
        lineGraph.draw();
    }
}
