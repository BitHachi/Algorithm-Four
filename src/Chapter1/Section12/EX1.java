package Chapter1.Section12;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

/**
 * @Program: Algorithm
 * @ClassName: EX1
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-07 20:15
 * @Version: V1.0
 * @Description: 编写一个Point2D的用例，从命令行接受一个整数N。
 * 在单位正方形内生成N个随机点，然后计算两点之间的最近距离。
 **/

public class EX1 {
    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
        int N=5;
        Point2D[] points = new Point2D[N];//创建N个点
        StdDraw.setPenRadius(.035);//设置笔的大小
        StdDraw.setPenColor(StdDraw.BLUE);//设置笔的颜色
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(Math.random(), Math.random());//每个点随机x,y坐标
            points[i].draw();//画出这个点
        }
        if (N > 1) {
            double min = points[0].distanceTo(points[1]);
            Point2D[] two=new Point2D[2];//存储距离最短的两个点
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (points[i].distanceTo(points[j]) < min) {//选出距离最短的两个点
                        min = points[i].distanceTo(points[j]);
                        two[0]=points[i];//存储距离最短的两个点
                        two[1]=points[j];
                    }
                }
            }
            StdDraw.setPenRadius(.015);//设置笔的大小
            StdDraw.setPenColor(StdDraw.RED);//设置笔的颜色
            StdDraw.line(two[0].x(),two[0].y(),two[1].x(),two[1].y());
            System.out.println("Min distance: " + min);
        }
    }

}

