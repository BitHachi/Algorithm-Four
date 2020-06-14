package Chapter1.Section11;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_15
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-14 23:32
 * @Version: V1.0
 * @Description: 练习题1.1.15
 **/

public class EX1_1_15 {
    public static void main(String[] args) {
        /************  1.1.15  ************/
        int[] a = new int[StdRandom.uniform(8, 16)];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(a.length);
            if (max < a[i]) max = a[i];
            //选出最大值max,来设置M的值,M=max+1
            // 数组索引从0开始，所以M=max+1，确保最大值可以进行统计
        }
        /************  原数组值  ************/
        for (int v : a) {
            System.out.print(v + ",");
        }
        System.out.println("\nMax=" + max);
        /************  返回数组的值  ************/
        int i = 0;
        for (int v : histogram(a, max + 1)) {
            System.out.print("b[" + i + "]=" + v + ",");
            i++;
            if (i % 5 == 0) System.out.println();
        }
    }

    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int i = 0; i < b.length; i++) {
            b[a[i]]++;
        }
        return b;
    }
}

