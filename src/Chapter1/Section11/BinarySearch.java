package Chapter1.Section11;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() {
    }

    // 查询key是否在数组a中，在就返回mid索引，不在就返回-1.
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    //个人感觉没有必要，这里只是传递了一下，不知道作者是怎么想的
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    public static void main(String[] args) {

        // 从文件中读取数据
        In in = new In(args[0]);
        //这里有几个打印语句，我就是好奇想知道它存的是啥
        System.out.println("in：" + in.toString());
        System.out.println("in对象的内容：" + Arrays.toString(args));
        int[] whitelist = in.readAllInts();
        System.out.println("whitelist：" + whitelist.toString());
        System.out.println("whitelist数组未排序：" + Arrays.toString(whitelist));
        //排序数组
        Arrays.sort(whitelist);
        System.out.println("whitelist数组已排序：" + Arrays.toString(whitelist));
        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            //这里只是想看一下key是什么。标准输入的数据是啥
            System.out.print(key + ",");
            if (rank(key, whitelist) == -1)
                //这里我改了一下，*x*即为tinyT.txt中不再tinyW.txt中的数据
                StdOut.print("*" + key + "*,");
        }
    }
}
