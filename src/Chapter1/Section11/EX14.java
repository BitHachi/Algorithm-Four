package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_14
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:22
 * @Version: V1.0
 * @Description: 练习题1.1.14
 **/

public class EX14 {
    public static void main(String[] args) {
        /************  1.1.14  ************/
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(3));
        System.out.println(lg(9));
    }
    public static int lg(int N) {
        /*k<=log2N,及n=2^k^<=N
         * K从0开始计数，则n从2^k^=1=1开始计数*/
        int k = 0, n = 1;
        while (n <= N) {
            n *= 2;
            k++;
        }
        return k - 1;//结束循环时，n>N.所以k需要减1
    }
}

