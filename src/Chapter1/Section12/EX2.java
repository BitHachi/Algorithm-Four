package Chapter1.Section12;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Program: Algorithm
 * @ClassName: EX2
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-07 20:45
 * @Version: V1.0
 * @Description: 编写一个Interval1D的用例，从命令行接受一个整数N。
 * 从标准输入中读取N个间隔（每个间隔由一对double值定义）并打印出所有相交的间隔对。
 **/

public class EX2 {
    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
        int N=5;
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }
        if (N > 2) {
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (intervals[i].intersects(intervals[j])) {
                        System.out.println(intervals[i] + " intersects " + intervals[j]);
                    }
                }
            }
        }
    }

}

