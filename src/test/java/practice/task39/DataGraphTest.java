package practice.task39;

import org.junit.jupiter.api.Test;

public class DataGraphTest {
    @Test
    public void updateData() {
        DataGraph.graphs[0] = new BarGraph();
        DataGraph.graphs[1] = new ChartGraph();
        DataGraph.graphs[2] = new LineGraph();

//        for(Observer graph : DataGraph.graphs) {
//            graph.draw();
//        }
    }
}
