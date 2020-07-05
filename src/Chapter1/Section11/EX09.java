package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_9
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:17
 * @Version: V1.0
 * @Description: 练习题1.1.9
 **/

public class EX09 {
    public static void main(String[] args) {
        /************  1.1.9  ************/
        int N=100;
        System.out.println(Integer.toBinaryString(N));
        String s="";
        //从低位往高位求
        for(int n=N;n>0;n/=2)
            s=(n%2)+s;
        System.out.println(s);
    }
}

