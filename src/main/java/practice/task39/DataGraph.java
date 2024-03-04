package practice.task39;

public class DataGraph {
    // TODO: не сделано
    private static DataGraph INSTANCE;
    private final int N = 10;
    private double[] data = new double[N];
    private Observer[] graphs;

    private DataGraph() {}

    public static DataGraph getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DataGraph();
        }

        return INSTANCE;
    }

    public int getN() {
        return N;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public Observer[] getGraphs() {
        return graphs;
    }

    public void setGraphs(Observer[] graphs) {
        this.graphs = graphs;
    }

    public void updateDataGraphs() {
        for (Observer graph : graphs) {
            graph.update();
        }
    }
}
