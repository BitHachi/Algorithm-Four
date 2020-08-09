package Chapter1.Section12;

/**
 * @Program: Algorithm
 * @ClassName: EX8
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-09 20:28
 * @Version: V1.0
 * @Description:
 * 设a[]和b[]均为长数百万的整形数组。以下代码的作用是什么？有效吗？
 * int[] t = a;
 * a = b;
 * b = t;
 **/

public class EX8 {
    public static void main(String[] args) {
        int[] a=new int[1000000];
        int[] b=new int[1000000];
        /*public static long nanoTime()
        以纳秒为单位返回正在运行的Java虚拟机的高分辨率时间源的当前值。*/
        //这段代码将交换数组a和b的引用。有效
        long start_time = System.nanoTime();
        int[] t = a;
        a = b;
        b = t;
        long end_time = System.nanoTime();

        System.out.println(end_time);
        System.out.println(start_time);
        System.out.println(end_time-start_time);

    }
}

