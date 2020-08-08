package Chapter1.Section12;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Program: Algorithm
 * @ClassName: EX4
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-08 22:49
 * @Version: V1.0
 * @Description:
 **/

public class EX4 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);//world
        StdOut.println(string2);//Hello
    }
}

