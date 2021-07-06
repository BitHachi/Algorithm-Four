package Chapter2.Section21;

import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;
import java.util.Random;

/**
 * @author: BitHachi
 * @create: 2021-03-23 10:05
 * @description: 选择排序
 **/
public class Shell {

    // This class should not be instantiated.
    private Shell () {
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        //选择一个增量序列 t1，t2，……，tn，其中 ti > t(i+1), tn = 1；
        int h = n/2;
        while (h >= 1) {
            // 对数组进行增量h排序
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            assert isHsorted(a, h);
            h /= 2;
        }
        assert isSorted(a);
    }

    /***************************************************************************
     *  辅助函数
     ***************************************************************************/

    // v<w则返回true
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    // v<w则返回true
    private static boolean less(Comparator comparator, Object v, Object w) {
        return comparator.compare(v, w) < 0;
    }

    // 交换 a[i] and a[j] 的位置
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    /***************************************************************************
     *  检查数组是否已排序---对调试很有用。
     ***************************************************************************/
    //检查数组是否为h增量有序的
    private static boolean isHsorted(Comparable[] a, int h) {
        for (int i = h; i < a.length; i++)
            if (less(a[i], a[i-h])) return false;
        return true;
    }
    //验证数组a[]是否有序
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    //验证数组a[]是否有序
    private static boolean isSorted(Object[] a, Comparator comparator) {
        return isSorted(a, comparator, 0, a.length - 1);
    }

    // 检查数组元素从索引lo->hi是否有序（lo<hi）
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    // 检查数组元素从索引lo->hi是否有序（lo<hi）
    private static boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(comparator, a[i], a[i - 1])) return false;
        return true;
    }

    // 打印数组
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+" < ");
        }
    }

    /**
     * 测试用例：
     *   从标准输入中读取一系列字符串；对它们进行选择排序； 并将它们以升序打印到标准输出。
     */
    public static void main(String[] args) {
        final int NUM=20;
        Random random = new Random();

        //数字测试
        Integer[] a=new Integer[NUM];
        for (int i = 0; i < NUM; i++) {
            int x = random.nextInt(100);
            a[i]=Integer.valueOf(x);
        }

        //单字符测试
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//abcdefghijklmnopqrstuvwxyz
        Character[] b=new Character[NUM];
        for( int i = 0; i < NUM; i ++) {
            b[i]=new Character(s.charAt(random.nextInt(25)));
        }
        Shell.sort(a);
        Shell.sort(b);
        show(a);
        System.out.println();
        show(b);

    }
}
