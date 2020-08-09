package Chapter1.Section12;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @Program: Algorithm
 * @ClassName: EX10
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-09 22:26
 * @Version: V1.0
 * @Description:
 * 编写一个类VisualCounter，支持加一和减一操作。
 * 它的构造函数接受两个参数N和max，其中N指定了操作的最大次数，max指定了计数器的最大绝对值。
 * 作为副作用，用图像显示每次计数器变化后的值。
 **/

public class EX10 {
    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(20, 5);

        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        for (int i = 0; i < 15; i++) {
            counter.decrement();
        }
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}

 class VisualCounter {
    private int count;
    private int n;
    private int N;
    private int max;

    //n指定了操作的最大次数，max指定了计数器的最大绝对值
    public VisualCounter(int n, int max) {
        N = n;
        this.max = max;
        count = 0;
        this.n = 0;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(0.01);
        StdDraw.point(0, 0);
    }

    public void increment() {
        if (n + 1 > N) {
            System.out.println("Operate too much!");
            return;
        }
        if (count + 1 > max) {
            System.out.println("Exceed the max!");
            return;
        }
        count++;
        n++;
        StdDraw.point(n, count);
    }

    public void decrement() {
        if (n + 1 > N) {
            System.out.println("Operate too much!");
            return;
        }
        if (count - 1 < -max) {
            System.out.println("Exceed the min!");
            return;
        }
        count--;
        n++;
        StdDraw.point(n, count);
    }

    public int getCount() {
        return count;
    }
}