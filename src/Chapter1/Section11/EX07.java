package Chapter1.Section11;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_7
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:15
 * @Version: V1.0
 * @Description: 练习题1.1.7
 **/

public class EX07 {
    public static void main(String[] args) {
        /************  1.1.7  ************/
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.8f\n", t);
        //b
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++) {
                sum++;//这是一个累加的过程,i=1,则sum加1次，i=2,则sum加2次
            }
        StdOut.println(sum);
        //c
        sum=0;
        for (int i = 1; i < 10; i *= 2)//1.2.4.8，一共循环4次
            for (int j = 0; j < 10; j++) {
                System.out.print(sum+",");
                sum++;//一共加了4次10
                System.out.print(sum+",j="+j);
                System.out.println();
            }
        StdOut.println(sum);
    }
}

