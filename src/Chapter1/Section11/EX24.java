package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX24
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-20 21:47
 * @Version: V1.0
 * @Description: 练习题1.1.24
 **/

public class EX24 {
    public static int euclid(int p, int q) {
        System.out.println("p = " + p + ", q = " + q);
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) {
        System.out.println("result: " + euclid(105, 24));
        System.out.println("result: " + euclid(1111111, 1234567));
    }
}

