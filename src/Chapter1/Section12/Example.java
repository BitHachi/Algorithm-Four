package Chapter1.Section12;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

/**
 * @author: BitHachi
 * @create: 2021-03-23 10:05
 * @description: 算法模板类
 **/
public class Example {

    // This class should not be instantiated.
    private Example() {
    }

    /**
     * 使用自然顺序以升序重新排列数组。
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            //往数组右边选出最小的
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            //将最小的元素与当前的元素进行交换
            exch(a, i, min);
            //验证已经排序的数组左边部分是否有序
            assert isSorted(a, 0, i);
        }
        //验证整个数组是否是有序的
        assert isSorted(a);
    }

    /**
     * 选择排序：使用比较器以升序重新排列阵列。
     */
    public static void sort(Object[] a, Comparator comparator) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(comparator, a[j], a[min])) min = j;
            }
            exch(a, i, min);
            assert isSorted(a, comparator, 0, i);
        }
        assert isSorted(a, comparator);
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
            StdOut.println(a[i]);
        }
    }

    /**
     * 测试用例：
     *   从标准输入中读取一系列字符串；对它们进行选择排序； 并将它们以升序打印到标准输出。
     */
    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        Example.sort(a);
        show(a);
    }
}
