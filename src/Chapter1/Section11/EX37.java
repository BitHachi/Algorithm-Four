package Chapter1.Section11;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @Program: Algorithm
 * @ClassName: EX37
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-16 19:23
 * @Version: V1.0
 * @Description: 练习题1.1.37
 **/

public class EX37 {
    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(N); //  [0,N)
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Error");
//            return;
//        }
//        int M = Integer.parseInt(args[0]), N = Integer.parseInt(args[1]);
        int M=6,N=10;
        int[] a = new int[M];
        int[][] Info=new int[M][M];
        for(int k=0;k<N;k++)
        {
            //每次打乱前数组重新初始化为a[i]=i
            for(int i=0;i<M;i++)
                a[i]=i;
            //打乱
            shuffle(a);
            //打乱后i行的值落到j列的次数增1
            for(int i=0;i<a.length;i++)
                Info[a[i]][i]++;
        }
        for(int []i : Info) {
            for (int j:i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

