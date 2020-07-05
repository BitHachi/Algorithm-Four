package Chapter1.Section11;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX33
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-07-05 20:49
 * @Version: V1.0
 * @Description: 练习题1.1.33
 **/

public class EX33 {

    public static void main(String[] args) {

        In in1 = new In("data/BitHachi-1.txt");
        In in2 = new In("data/BitHachi-2.txt");
        /*一维数组x和y初始化：*/
        double[] x = in1.readAllDoubles();
        double[] y=in2.readAllDoubles();
        System.out.println("x: "+Arrays.toString(x));
        System.out.println("y: "+Arrays.toString(y));
        /**
         两个向量a = [a1, a2,…, an]和b = [b1, b2,…, bn]的点积(乘)定义为：
         a·b=a1b1+a2b2+……+anbn。
         点乘必须两个数组元素个数相等
         */
        System.out.println("点乘： dot(x, y)= " + Matrix.dot(x, y));

        int  h =x.length,w=y.length;
        /*矩阵a初始化： */
        double[][] a = new double[h-2][w];
        for (int i = 0; i < a.length; i++) {
            if(i%2==0) {
                a[i]= Arrays.copyOf(x,5);
            }
            else a[i]=Arrays.copyOf(y,5);
        }
        /*矩阵b初始化：*/
        double[][] b = new double[h][w-2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(i%2!=0) {
                    b[i]= Arrays.copyOf(x,3);
                }
                else b[i]=Arrays.copyOf(y,3);
            }
        }
        System.out.println("a矩阵：");
        for(double []d :  a) System.out.println(Arrays.toString(d));
        System.out.println("b矩阵：");
        for(double []d :  b) System.out.println(Arrays.toString(d));

        /**
         * 两个矩阵之积
         */
        System.out.println("矩阵a和b的积：");
        double[][] matrix = Matrix.mult(a, b);
        for(double []r :  matrix){
            for(double rv : r)
            System.out.print(rv+ " _ ");
            System.out.println();
        }


//        matrix = transpose(a);
//        if (matrix != null) {
//            System.out.println("transpose(a):");
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//        double[] array = mult(a, x);
//        if (array != null) {
//            System.out.println("mult(a, x):");
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//            System.out.println();
//        }
//        array = mult(y, a);
//        if (array != null) {
//            System.out.println("mult(y, a):");
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//            System.out.println();
//        }
    }
}

