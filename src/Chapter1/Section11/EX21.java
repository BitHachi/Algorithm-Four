package Chapter1.Section11;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_21
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-20 19:12
 * @Version: V1.0
 * @Description: 练习题1.1.21
 **/

public class EX21 {
    public static void main(String[] args) {
        System.out.print("Please input count:");
        int n = StdIn.readInt();
        String[] name = new String[n];
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            name[i] = StdIn.readString();
            int j = 0;
            while (j < 2) {
                a[i][j] = StdIn.readInt();
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
                System.out.printf("%s\t%d\t%d\t%.3f\n", name[i], a[i][0], a[i][1],
                        (float) a[i][0] / a[i][1]);
        }
    }
}

