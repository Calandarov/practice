package practice.task39;

public class DataGraph {
    // TODO: доделать задание
    public static Observer[] graphs = new Observer[3];
    private static DataGraph INSTANCE;
    private final int N = 10;
    private double[] data = new double[N];

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

    public void updateDataGraphs() {
        for (Observer graph : graphs) {
            graph.update();
        }
    }
}
