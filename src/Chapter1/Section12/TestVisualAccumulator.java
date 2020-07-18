package Chapter1.Section12;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Program: Algorithm
 * @ClassName: sss
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-18 21:50
 * @Version: V1.0
 * @Description: 测试可视化累加器
 **/

public class TestVisualAccumulator {

    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T=50;
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}

