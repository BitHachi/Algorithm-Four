package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_12
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-14 23:21
 * @Version: V1.0
 * @Description:练习题1.1.12
 **/

public class EX12 {
    public static void main(String[] args) {
        /************  1.1.12  ************/
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int v : a) System.out.print(v + ",");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int v : a) System.out.print(v + ",");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+",");
        }
    }
}

