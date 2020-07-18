package Chapter1.Section11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX35
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-06 20:24
 * @Version: V1.0
 * @Description: 练习题1.1.35
 **/

public class EX35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for(int i = 1; i <= SIDES; i++)
            for(int j = 1; j <= SIDES; j++)
                dist[i+j] += 1.0;//计算两数之和的组合个数
        System.out.println(Arrays.toString(dist));
        for (int k = 2; k <= 2*SIDES; k++){
            dist[k] /= 36.0;
            System.out.println("理论上两骰子和为"+k+"的概率: "+dist[k]);
        }

        int[] num = new int[2 * SIDES + 1];
        int N = StdIn.readInt();
        for (int i = 0; i < N; i++) {//模拟N次掷骰子
            num[StdRandom.discrete(dist)]++;//返回i的概率为dist[i]
        }
        System.out.println("模拟N次掷骰子两骰子之和的值出现的频率：");
        System.out.println(Arrays.toString(num));

        double frequency;
        boolean isAccurate = true;
        for (int i = 2; i <= 2 * SIDES; i++) {
            frequency = (double) num[i] / N;
            System.out.println("实际数据计算出的两骰子和为"+i+"的概率: "+frequency);
            if (Math.abs(frequency - dist[i]) > 0.001) {
                isAccurate = false;
            }
        }
        System.out.println("是否吻合程度达到小数点后三位： " + isAccurate);


    }
}

