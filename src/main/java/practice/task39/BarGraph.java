package practice.task39;

import java.util.Arrays;

public class BarGraph implements Observer {
    DataGraph dg;

    public BarGraph() {
        dg = DataGraph.getInstance();
    }

    public void draw(double[] data) {
        System.out.println(Arrays.toString(data));
    }

    public void update() {
        draw(dg.getData());
    }
}
