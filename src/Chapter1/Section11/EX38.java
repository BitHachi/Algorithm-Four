package Chapter1.Section11;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX38
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-16 19:37
 * @Version: V1.0
 * @Description:
 **/

public class EX38 {
    public static void main(String[] args) {
        In in = new In("./data/largeW.txt");
        int[] whitelist = in.readAllInts();

        long startTime = System.currentTimeMillis();//开始时间
        long endTime = System.currentTimeMillis();//结束时间
        
        /************  暴力查找  ************/
        int key = StdIn.readInt();
        if (BruteForceSearch.rank(key, whitelist) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();//结束时间
        System.out.println("Brute force search time: " + (endTime - startTime));//用时长短

        /************  二分查找  ************/
        key = StdIn.readInt();
        startTime = System.currentTimeMillis();//开始时间
        Arrays.sort(whitelist);
        if (BinarySearch.indexOf(whitelist, key) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();//结束时间
        System.out.println("Binary search time: " + (endTime - startTime));//用时长短
    }
}

