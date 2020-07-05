package Chapter1.Section11;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * @Program: Algorithm
 * @ClassName: EX31
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-07-05 17:46
 * @Version: V1.0
 * @Description: 练习题1.1.131
 **/

public class EX31 {
    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        double p = Double.parseDouble(args[1]);
        int N= StdIn.readInt();
        double p=StdIn.readDouble();
        if (p < 0 || p > 1) {
            System.out.println("p is not valid!");
            return;
        }
        Point[] points = new Point[N];//N个点构成一个圆
        double angle = 360.0 / N;//等间距度数
        StdDraw.circle(0.5, 0.5, 0.5);//画一个圆心为（0.5，0.5）半径为0.5的圆
        StdDraw.setPenRadius(0.05);//设置画笔的粗细为0.05，为了使N个点看起来更清晰
        for (int i = 0; i < 6; i++) {//画等间距的N个点
            points[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180),
                    0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
            StdDraw.point(points[i].x, points[i].y);
        }
        StdDraw.setPenRadius(0.01);//设置画笔的粗细为0.01，为了使N个点看起来更清晰
        StdDraw.setPenColor(Color.GRAY);//设置画笔的颜色为灰色
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {//返回真的概率为p
                    //将两个点连线
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
    }
}

