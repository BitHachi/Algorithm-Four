package Chapter1.Section12;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import javax.xml.soap.SOAPPart;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Program: Algorithm
 * @ClassName: asdas
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-19 19:36
 * @Version: V1.0
 * @Description: 将二分查找重写为一段面向对象的程序（用于在整数集合中进行查找的一种抽象数据类型）
 **/

public class Whitelist {

    public static void main(String[] args) {
        int[] w = In.readInts("./data/tinyT.txt");
//        int[] w = new In("./data/tinyT.txt").readAllInts();
        Arrays.sort(w);
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}

