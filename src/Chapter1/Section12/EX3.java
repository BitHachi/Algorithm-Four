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
        StdDraw.setXscale(min, max);//设置X的范围
        StdDraw.setYscale(min, max);//设置Y的范围
        /*
            在Interval2D中，提供了两个长方形是否相交的方法，也就是intersect(Interval2d that)

            Interval2D给出的contains(Point2D p）方法，是用于计算一个点p是否包含在该长方形内。
            这里创建两个二维平面的点数组，用来计算包含关系,我们只要确定对角线在一个
            二维间隔里面就可以确定包含关系，二维间隔可以简单理解为长方形，通过对角线的两个点
            就可以确认一个长方形是否在另一个长方形内部
         */

        Point2D[] leftTopPoints = new Point2D[N];//创建一个二维平面上的 点 数组
        Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] intervals = new Interval2D[N];//创建二维平面间隔数组
        for (int i = 0; i < N; i++) {

            double left, right, top, bottom;
            Interval1D x, y;//声明一维直线间隔

            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);

            left=min(a,b);
            right=max(a,b);
            x = new Interval1D(left, right);//创建一个一维间隔

            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);

            top=min(a,b);
            bottom=max(a,b);
            y = new Interval1D(top, bottom);//创建一个一维间隔

            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);

            intervals[i] = new Interval2D(x, y);// 利用上面创建的两个一维间隔创建一个二维间隔
            intervals[i].draw();//画出该二维间隔
        }

        int containNum = 0, intervalNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (i<j && intervals[i].intersects(intervals[j])) {//i<j避免重复计算
                    intervalNum++;
                }
                //我们只要确定对角线在一个二维间隔里面就可以确定包含关系
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

