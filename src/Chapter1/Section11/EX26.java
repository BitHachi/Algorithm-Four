package Chapter1.Section11;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Program: Algorithm
 * @ClassName: EX26
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-21 18:08
 * @Version: V1.0
 * @Description: 练习题1.1.26
 **/

public class EX26 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        //15 13 10
        int t;
        //13 15 10
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        //10 15 13  把最小的挑出来放在第一个
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        //10 13 15  把第二小的挑出来放在第二个，第三个自然就是最大的
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}

