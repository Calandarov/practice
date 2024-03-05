package practice.task29.subtask3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {
    Line l1;
    Line l2;
    @Test
    public void linesIntersect() {
        l1 = new Line(2, 2, 7, 3);
        l2 = new Line(4, 1, 5, 6);

        boolean isIntersection = false;
        double x1 = l1.getX1();
        double y1 = l1.getY1();
        double x2 = l1.getX2();
        double y2 = l1.getY2();

        double x3 = l2.getX1();
        double y3 = l2.getY1();
        double x4 = l2.getX2();
        double y4 = l2.getY2();

        double k1;
        double k2;
        double numerator1;
        double numerator2;
        double denominator;

        denominator = (y4 - y3) * (x1 - x2) - (x4 - x3) * (y1 - y2);

        if(denominator != 0) {
            numerator1 = (x4 - x2) * (y4 - y3) - (x4 - x3) * (y4 - y2);
            numerator2 = (x1 - x2) * (y4 - y2) - (x4 - x2) * (y1 - y2);
            k1 = numerator1 / denominator;
            k2 = numerator2 / denominator;

            isIntersection = k1 >=0 && k1 <=1 && k2 >=0 && k2 <=1;
        }

        Assertions.assertTrue(isIntersection);
    }

    @Test
    public void linesNotIntersect() {
        l1 = new Line(0, 3, 1, 1);
        l2 = new Line(3, 1, 4, 3);

        boolean isIntersection = false;
        double x1 = l1.getX1();
        double y1 = l1.getY1();
        double x2 = l1.getX2();
        double y2 = l1.getY2();

        double x3 = l2.getX1();
        double y3 = l2.getY1();
        double x4 = l2.getX2();
        double y4 = l2.getY2();

        double k1;
        double k2;
        double numerator1;
        double numerator2;
        double denominator;

        denominator = (y4 - y3) * (x1 - x2) - (x4 - x3) * (y1 - y2);

        if(denominator != 0) {
            numerator1 = (x4 - x2) * (y4 - y3) - (x4 - x3) * (y4 - y2);
            numerator2 = (x1 - x2) * (y4 - y2) - (x4 - x2) * (y1 - y2);
            k1 = numerator1 / denominator;
            k2 = numerator2 / denominator;

            isIntersection = k1 >=0 && k1 <=1 && k2 >=0 && k2 <=1;
        }

        Assertions.assertFalse(isIntersection);
    }

    @Test
    public void linesParallel() {
        l1 = new Line(1, 1, 1, 3);
        l2 = new Line(2, 1, 2, 3);

        boolean isIntersection = false;
        double x1 = l1.getX1();
        double y1 = l1.getY1();
        double x2 = l1.getX2();
        double y2 = l1.getY2();

        double x3 = l2.getX1();
        double y3 = l2.getY1();
        double x4 = l2.getX2();
        double y4 = l2.getY2();

        double k1;
        double k2;
        double numerator1;
        double numerator2;
        double denominator;

        denominator = (y4 - y3) * (x1 - x2) - (x4 - x3) * (y1 - y2);

        if(denominator != 0) {
            numerator1 = (x4 - x2) * (y4 - y3) - (x4 - x3) * (y4 - y2);
            numerator2 = (x1 - x2) * (y4 - y2) - (x4 - x2) * (y1 - y2);
            k1 = numerator1 / denominator;
            k2 = numerator2 / denominator;

            isIntersection = k1 >=0 && k1 <=1 && k2 >=0 && k2 <=1;
        }

        Assertions.assertFalse(isIntersection);
    }
}
