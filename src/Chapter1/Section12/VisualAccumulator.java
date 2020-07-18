package Chapter1.Section12;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @Program: Algorithm
 * @ClassName: VisualAccumalator
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-18 21:46
 * @Version: V1.0
 * @Description: 可视化累加器
 **/

public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.035);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }


}

