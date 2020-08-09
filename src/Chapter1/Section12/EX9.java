package Chapter1.Section12;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX9
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-09 20:49
 * @Version: V1.0
 * @Description:
 **/

public class EX9 {
    /************  递归版  ************/
    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi)    return -1;

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }
    /************  非递归版  ************/
    public static int rank(int key, int[] a, int lo, int hi, Counter counter) {
        if (lo > hi) {
            return -1;
        }
        counter.increment();//计数器加一
        System.out.println("lo="+lo+",hi="+hi);
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, counter);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, counter);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
//        System.out.print("N: ");
//        int N = StdIn.readInt();
        int[] a = new int[20];//N写成20测试
        a= new int[]{0, 0, 2, 3, 4, 5, 6, 9, 11, 11, 12, 13, 14, 15, 15, 15, 16, 16, 17, 18};
//        System.out.print("list: ");
//        for (int i = 0; i < N; i++) {
//            a[i] = StdRandom.uniform(N);
//        }
//        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.print("key: ");
        int key = StdIn.readInt();
        Counter counter = new Counter("keys");
        System.out.println("key="+rank(key, a, 0,a.length,counter));
        System.out.println(counter);
    }
}

