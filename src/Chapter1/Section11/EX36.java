package Chapter1.Section11;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Program: Algorithm
 * @ClassName: EX36
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-16 19:11
 * @Version: V1.0
 * @Description: 练习题1.1.36
 *
 * 参考：https://www.cnblogs.com/longjin2018/p/9848742.html
 **/

public class EX36 {
    public static void main(String[] args)
    {
//        int M=Integer.parseInt(args[0]);
//        int N=Integer.parseInt(args[1]);
        int M=6,N=10;
        int[] a=new int[M];
        int[][] Info=new int[M][M];
        //N次打乱
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
        //打印M*M数组
        printArray(Info);

    }

    //打乱数组
    public static void shuffle(int[] a)
    {
        int N=a.length;
        for (int i=0;i<N;i++)
        {
            int r=i+ StdRandom.uniform(N-i);//返回0~N-i之间的整数再加i
            int temp=a[i];
            a[i]=a[r];
            a[r]=temp;
        }
    }//结束打乱


    //打印数组
    private static void printArray(int[][] array)
    {
        int rowLen=array.length;
        int colLen=array[0].length;
        StdOut.printf(" ");
        for (int col=0;col<colLen;col++)
            StdOut.printf("%5d",col);
        StdOut.printf("\n");
        //
        for (int row=0;row<rowLen;row++)
        {
            StdOut.printf("%d",row);
            for (int col=0;col<colLen;col++)
                StdOut.printf("%5d",array[row][col]);
            StdOut.printf("\n");
        }
    }
}
