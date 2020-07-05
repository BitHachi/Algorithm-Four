package Chapter1.Section11;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Program: Algorithm
 * @ClassName: EX30
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-07-05 10:50
 * @Version: V1.0
 * @Description: 练习题1.1.30
 * <p>
 * 互质是公约数只有1的两个整数，叫做互质整数。
 **/

public class EX30 {

    public static boolean fun(int p, int q) {
        if (p == 0 || q == 0) return false;
        if (p == 1 || q == 1) return true;
        int temp = 0, index = 2;
        temp = p <= q ? p : q;
        while (index <= temp) {
            if (p % index == 0 && q % index == 0) {//如果两个数不互质，返回false
                return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = fun(i, j);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

