package Chapter1.Section12;

import edu.princeton.cs.algs4.*;

/**
 * @Program: Algorithm
 * @ClassName: EX3
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-07 21:38
 * @Version: V1.0
 * @Description: 编写一个Interval2D的用例，从命令行接受参数N、min和max。
 * 生成N个随机的2D间隔，其宽度和高均匀地分布在单位正方形中的min和max之间。
 * 用StdDraw画出它们并打印出相交的间隔对的数量以及有包含关系的间隔对数量。
 **/

public class EX3 {
    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        double min = Double.parseDouble(args[1]);
//        double max = Double.parseDouble(args[2]);
        int N = 5;
        double min = 1;
        double max = 10;
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Point2D[] leftTopPoints = new Point2D[N];
        Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] intervals = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, bottom;
            Interval1D x, y;
            left=min(a,b);
            right=max(a,b);
            x = new Interval1D(left, right);
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            top=min(a,b);
            bottom=max(a,b);
            y = new Interval1D(top, bottom);
            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);
            intervals[i] = new Interval2D(x, y);
            intervals[i].draw();
        }

        int containNum = 0, intervalNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j > i && intervals[i].intersects(intervals[j])) {
                    intervalNum++;
                }
                if (j != i && intervals[i].contains(leftTopPoints[j]) && intervals[i].contains(rightBottomPoints[j])) {
                    containNum++;
                }
             }
        }
        System.out.println("Interval count: " + intervalNum);
        System.out.println("Contain count: " + containNum);
    }

    public static double min(double d1, double d2) {
        return d1 < d2 ? d1 : d2;
    }

    public static double max(double d1, double d2) {
        return d1 > d2 ? d1 : d2;
    }

}

