package Chapter1.Section11;

import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: EX28
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-06-27 21:12
 * @Version: V1.0
 * @Description: 练习题1.1.28
 **/

public class EX28 {
    public static void main(String[] args) {
        int[] whitelist = {27, 11, 5, 11, 91, 5, 27, 27, 15, 11};
        // sort the array
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length-1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        for (int v : list) System.out.print(v + ",");
    }
}

