package Chapter1.Section11;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Program: Algorithm
 * @ClassName: EX06
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-14 23:13
 * @Version: V1.0
 * @Description: 练习题1.1.6
 **/

public class EX1_1_6 {
    public static void main(String[] args) {
        /************  1.1.6  ************/
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.print("*" + f + "*  ");
            f = f + g;
            g = f - g;
            System.out.print("f=" + f + ",g=" + g);
            System.out.println();
        }
    }
}

