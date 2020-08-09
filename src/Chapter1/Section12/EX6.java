package Chapter1.Section12;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Program: Algorithm
 * @ClassName: EX6
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-09 19:46
 * @Version: V1.0
 * @Description:
 **/

public class EX6 {
    public static void main(String[] args) {
        System.out.print("s: ");
        String s = StdIn.readLine();
        System.out.print("t: ");
        String t = StdIn.readLine();
        /*
            public String concat(String str)
            将指定的字符串连接到该字符串的末尾。
            public int indexOf(String str)
            返回指定子字符串第一次出现的字符串内的索引。
         */
        System.out.println(s.concat(s));
        System.out.println(s.concat(s).indexOf(t));
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
            System.out.println(s + " is the circular rotation of " + t);
        } else {
            System.out.println(s + " is not the circular rotation of " + t);
        }
    }
}

