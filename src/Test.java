import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: Test
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-20 21:28
 * @Version: V1.0
 * @Description: TEST
 **/

public class Test {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
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
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 12};
        System.out.printf("+ or - ? ");
        char arg = StdIn.readChar();
        StdIn.readLine();
        System.out.printf("Input keys: ");
        String[] keys = StdIn.readLine().split(" ");
        System.out.println(Arrays.toString(keys));
        for (int i = 0; i < keys.length; i++) {
            if (rank(Integer.parseInt(keys[i]), a) != -1 && arg == '-') {
                System.out.printf("%s ", keys[i]);
            } else if (rank(Integer.parseInt(keys[i]), a) == -1 && arg == '+') {
                System.out.printf("%s ", keys[i]);
            }
        }
        System.out.println();
    }
}


