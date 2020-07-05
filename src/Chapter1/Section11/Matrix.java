package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: Matrix
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-05 23:03
 * @Version: V1.0
 * @Description: 练习题1.1.33Matrix库
 **/

public class Matrix {
    /**
     * 点乘
     * @param x
     * @param y
     * @return x和y点乘的结果
     */
    public static double dot(double[] x, double[] y) {
        double result = 0;
        if (x.length == y.length) {
            for (int i = 0; i < y.length; i++) {
                result += x[i] * y[i];
            }
            return result;
        } else {
            System.out.println("Error!");
            return result;
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return 矩阵a与b相乘后的数组结果、
     *  注意事项：
     * 1、当矩阵A的列数（column）等于矩阵B的行数（row）时，A与B可以相乘。
     * 2、矩阵C的行数等于矩阵A的行数，C的列数等于B的列数。
     * 3、乘积C的第m行第n列的元素等于矩阵A的第m行的元素与矩阵B的第n列对应元素乘积之和。
     */
    public static double[][] mult(double[][] a, double[][] b) {
        //a.length为a数组的行数
        //b[0].length为b数组的列数
        //当矩阵A的列数（column）等于矩阵B的行数（row）时，A与B可以相乘。
        if (a.length == b[0].length) {
            double[][] s = new double[a.length][b[0].length];
//            System.out.println("新矩阵行数："+a.length);
//            System.out.println("新矩阵列数："+b[0].length);
            for (int i = 0; i < a.length; i++) {//遍历行
                for (int j = 0; j < b[0].length; j++) {//遍历列
                    for (int k = 0; k <a[0].length; k++) {//i行元素个数==j列元素个数，写b.length也对
         //乘积s的第i行第j列的元素等于矩阵a的第i行的元素与矩阵b的第j列对应元素乘积之和。
                        s[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return s;
        } else {
            System.out.println("Error!");
            return null;
        }
    }

    public static double[][] transpose(double[][] a) {
        double[][] s = new double[a[0].length][a.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = a[j][i];
            }
        }
        return s;
    }

    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length == x.length) {
            double[] y = new double[a.length];
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    y[i] += a[i][j] * x[j];
                }
            }
            return y;
        } else {
            return null;
        }
    }

    public static double[] mult(double[] y, double[][] a) {
        if (y.length == a.length) {
            double[] x = new double[a[0].length];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    x[i] += y[j] * a[j][i];
                }
            }
            return x;
        } else {
            return null;
        }
    }
}

