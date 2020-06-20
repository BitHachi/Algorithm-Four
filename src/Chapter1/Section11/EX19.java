package Chapter1.Section11;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_19
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-20 16:48
 * @Version: V1.0
 * @Description: 练习题1.1.19
 **/

public class EX19 {
    public static long[] F(int N) {
        long[] fibonacci = new long[N + 1];
        if (N == 0) {
            return fibonacci;
        }
        fibonacci[1] = 1;
        if (N == 1) {
            return fibonacci;
        }
        //这里不再用递归，而是直接用公式计算，效率更高，更快
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        long[] fibonacci = F(99);
        for (int N = 0; N < fibonacci.length; N++) {
            StdOut.println(N + " " + fibonacci[N]);
        }
    }
}

