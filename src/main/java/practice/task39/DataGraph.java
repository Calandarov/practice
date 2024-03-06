package practice.task39;

import java.util.Arrays;

public class DataGraph {
    public static Observer[] graphs = new Observer[3];
    private static final DataGraph INSTANCE = new DataGraph();
    private final int N = 10;
    private double[] data = new double[N];

    private DataGraph() {
        Arrays.fill(data, 2);
    }

    public static DataGraph getInstance() {
        return INSTANCE;
    }

    public int getN() {
        return N;
    }

    public double[] getData() {
        return data;
    }

    public void updateDataGraphs() {
        for (Observer graph : graphs) {
            graph.update();
        }
    }
}
