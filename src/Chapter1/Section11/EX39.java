package Chapter1.Section11;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX39
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-16 19:57
 * @Version: V1.0
 * @Description: 练习题1.1.39
 **/

public class EX39 {
    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T=6;
        int[] num = new int[4];
        for (int i = 0; i < T; i++) {//对N为10^3 10^4 10^5 10^6运行T遍
            int N = 100;
            for (int j = 0; j < 4; j++) {
                N *= 10; //对N为10^3 10^4 10^5 10^6运行T遍
                int[] a = new int[N];
                int[] b = new int[N];
                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);//[100000, 1000000)
                    b[k] = StdRandom.uniform(100000, 1000000);
                }
                Arrays.sort(a);
                for (int k = 0; k < N; k++) {
                    //二分循环查找一个数组中的值是否在另一个数组中
                    if (BinarySearch.indexOf(a, b[k]) != -1) {
                        num[j]++; //对于每个N，N为10^3 10^4 10^5 10^6
                    }
                }
            }
        }
        System.out.println("N\t\tAverage");
        int N = 100;
        for (int i = 0; i < 4; i++) {
            N *= 10;//N为10^3 10^4 10^5 10^6
            System.out.printf("%d\t%f\n", N, (double) num[i] / T);
        }
    }
}

