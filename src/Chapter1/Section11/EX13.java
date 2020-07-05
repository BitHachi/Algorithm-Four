package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_13
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:21
 * @Version: V1.0
 * @Description: 练习题1.1.13
 **/

public class EX13 {
    public static void main(String[] args) {
        /************  1.1.13  ************/
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (i + 1) * 10 + j + 1;
            }
        }
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + ",");
            }
            System.out.println();
        }
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            //注意只能遍历一半，所以j<=i,如果全部遍历，则数据交换了两次,相当于没有置
            for (int j = 0; j < a[0].length; j++) {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
            System.out.println("测试第"+i+"次");
            for (int[] ii : a) {
                for (int jj : ii) {
                    System.out.print(jj + ",");
                }
                System.out.println();
            }
        }
        System.out.println("---------------");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }
}

