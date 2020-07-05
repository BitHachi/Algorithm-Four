package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_20
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-20 17:18
 * @Version: V1.0
 * @Description: 练习题1.1.20
 **/

public class EX20 {
    public static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            /*static double log(double a)
            * 返回的自然对数（以 e为底） double值。 */
            return Math.log(N) + ln(N - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}

