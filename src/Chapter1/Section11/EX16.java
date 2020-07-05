package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_16
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:27
 * @Version: V1.0
 * @Description: 练习题1.1.16
 **/

public class EX16 {
    public static void main(String[] args) {
        /************  1.1.16  ************/
        System.out.println(exR1(6));
    }
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}

