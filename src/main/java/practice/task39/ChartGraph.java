package practice.task39;

import java.util.Arrays;

public class ChartGraph implements Observer {
    DataGraph dg;

    public ChartGraph(DataGraph dg) {
        this.dg = dg;
    }

    public void draw() {
        System.out.println(Arrays.toString(dg.getData()));
    }

    public void update() {
        draw();
    }
}
