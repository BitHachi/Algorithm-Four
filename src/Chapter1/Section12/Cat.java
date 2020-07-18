package Chapter1.Section12;

/**
 * @Program: Algorithm
 * @ClassName: Cat
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-18 21:17
 * @Version: V1.0
 * @Description:
 **/

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;


public class Cat {
    public static void main(String[] args) {
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}

