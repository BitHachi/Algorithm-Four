package Chapter1.Section12;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Program: Algorithm
 * @ClassName: TestV
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-18 21:48
 * @Version: V1.0
 * @Description: 测试累加器
 **/

public class TestAccumulator {

    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T=2000;
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);
    }
}
