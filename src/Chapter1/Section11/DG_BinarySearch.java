package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: DG_BinarySearch
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-20 21:11
 * @Version: V1.0
 * @Description: 递归二分查找
 **/

public class DG_BinarySearch {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

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
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
        int key = 6;
        int pos = rank(key, a);
        if (pos == -1) {
            System.out.println("not found!");
        } else {
            System.out.println("position=" + pos);
        }
    }
}

