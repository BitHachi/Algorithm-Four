package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: PracticeMain
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-05-06 22:30
 * @Version: V1.0
 * @Description: 1.1练习题代码
 **/

public class PracticeMain {
    public static void main(String[] args) {
        /************  1.1.1  ************/
//        System.out.println((0+15)/2);
//        System.out.println(2.0e-6*100000000.1);
//        System.out.println(true&&false||true&&true);

        /************  1.1.2  ************/
//        System.out.println((1+2.236)/2);
//        System.out.println(1+2+3+4.0);
//        System.out.println(4.1>=4);
//        System.out.println(1+2+"3");//字符串型

        /************  1.1.3  ************/
//        if(args[0].equals(args[1])&&args[1].equals(args[2]))
//            System.out.println("equal");
//        else  System.out.println("not equal");

        /************  1.1.5  ************/
//        double x=0.8,y=1.9;
//        if(x>=0&&y>=0&&x<=1&&y<=1)
//            System.out.println(true);
//        else System.out.println(false);

        /************  1.1.6  ************/
//        int f = 0;
//        int g = 1;
//        for (int i = 0; i <= 15; i++) {
//            StdOut.print("*" + f + "*  ");
//            f = f + g;
//            g = f - g;
//            System.out.print("f=" + f + ",g=" + g);
//            System.out.println();
//        }

        /************  1.1.7  ************/
        //a
//        double t = 9.0;
//        while (Math.abs(t - 9.0 / t) > .001) {
//            t = (9.0 / t + t) / 2.0;
//        }
//        StdOut.printf("%.8f\n", t);
//        //b
//        int sum = 0;
//        for (int i = 1; i < 1000; i++)
//            for (int j = 0; j < i; j++) {
//                sum++;//这是一个累加的过程,i=1,则sum加1次，i=2,则sum加2次
//            }
//        StdOut.println(sum);
//        //c
//        sum=0;
//        for (int i = 1; i < 10; i *= 2)//1.2.4.8，一共循环4次
//            for (int j = 0; j < 10; j++) {
//                System.out.print(sum+",");
//                sum++;//一共加了4次10
//                System.out.print(sum+",j="+j);
//                System.out.println();
//            }
//        StdOut.println(sum);

        /************  1.1.8  ************/
//        System.out.println('b');
//        System.out.println('b'+'c');//98+99
//        System.out.println('a'+4);//97+4
//        System.out.println((char)('a'+4));//97+4

        /************  1.1.9  ************/
//        int N=100;
//        System.out.println(Integer.toBinaryString(N));
//        String s="";
//        //从低位往高位求
//        for(int n=N;n>0;n/=2)
//            s=(n%2)+s;
//        System.out.println(s);

        /************  1.1.10  ************/
//        int[] a;
//        for (int i = 0; i <10 ; i++) {
//            a[i]=i*i;
//        }

        /************  1.1.11  ************/
//        boolean[][] b = new boolean[3][3];
//        for (int i = 0; i < b.length; i++)
//            for (int j = 0; j < b[0].length; j++) {
//                if ((i + j) % 2 == 1)
//                    b[i][j] = true;
//                else b[i][j] = false;
//            }
//        int h=1;
//        for (boolean[] i : b) {
//            System.out.print("第"+h+"行:");
//            for (boolean j : i)
//                System.out.print(j + "-");
//            System.out.println();
//            h++;
//        }
//        /************  这里以1代表 *，以0代表" "  ************/
//        h=1;
//        for (boolean[] i : b) {
//            System.out.print("第"+h+"行:");
//            for (boolean j : i){
//                if(j==true) System.out.print("1"+"-");
//                else System.out.print("0"+"-");
//            }
//            System.out.println();
//            h++;
//        }

        /************  1.1.12  ************/
//        int[] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = 9 - i;
//        }
//        for (int v : a) System.out.print(v + ",");
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            a[i] = a[a[i]];
//        }
//        for (int v : a) System.out.print(v + ",");
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i+",");
//        }

        /************  1.1.13  ************/
//        int[][] a = new int[6][6];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                a[i][j] = (i + 1) * 10 + j + 1;
//            }
//        }
//        for (int[] i : a) {
//            for (int j : i) {
//                System.out.print(j + ",");
//            }
//            System.out.println();
//        }
//        int temp=0;
//        for (int i = 0; i < a.length; i++) {
//            //注意只能遍历一半，所以j<=i,如果全部遍历，则数据交换了两次,相当于没有置
//            for (int j = 0; j < a[0].length; j++) {
//                temp=a[i][j];
//                a[i][j]=a[j][i];
//                a[j][i]=temp;
//            }
//            System.out.println("测试第"+i+"次");
//            for (int[] ii : a) {
//                for (int jj : ii) {
//                    System.out.print(jj + ",");
//                }
//                System.out.println();
//            }
//        }
//        System.out.println("---------------");
//        for (int[] i : a) {
//            for (int j : i) {
//                System.out.print(j + ",");
//            }
//            System.out.println();
//        }

        /************  1.1.14  ************/
//        System.out.println(lg(1));
//        System.out.println(lg(2));
//        System.out.println(lg(3));
//        System.out.println(lg(9));

        /************  1.1.15  ************/
        /*int[] a = new int[StdRandom.uniform(8, 16)];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(a.length);
            if (max < a[i]) max = a[i];
            //选出最大值max,来设置M的值,M=max+1
            // 数组索引从0开始，所以M=max+1，确保最大值可以进行统计
        }
        *//************  原数组值  ************//*
        for (int v : a) {
            System.out.print(v + ",");
        }
        System.out.println("\nMax=" + max);
        *//************  返回数组的值  ************//*
        int i = 0;
        for (int v : histogram(a, max + 1)) {
            System.out.print("b[" + i + "]=" + v + ",");
            i++;
            if (i % 5 == 0) System.out.println();
        }*/

        /************  1.1.16  ************/
        System.out.println(exR1(6));

    }


    /************  练习题的各种函数方法  ************/

    /************  1.1.14  ************/
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

    /************  1.1.15  ************/
    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int i = 0; i < b.length; i++) {
            b[a[i]]++;
        }
        return b;
    }

    /************  1.1.16  ************/
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }


}

