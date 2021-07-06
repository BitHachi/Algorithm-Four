package Chapter1.Section14;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: BitHachi
 * @create: 2021-03-15 12:15
 * @description:
 **/

public class QuickFindUF {
    private int[] id;    // 用一个以触点为索引的数组作为数据结构来表示所有分量
    private int count;   // 分量的个数

    /**
     * 初始化数据，每个触点都构成一个只含有自己的分量
     */
    public QuickFindUF(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    /**
     * 返回分量的个数
     */
    public int count() {
        return count;
    }

    /**
     * 返回某个触点的分量值
     */
    public int find(int p) {
        validate(p);
        return id[p];
    }

    // 验证p是否为有效索引
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * 如果两个元素在同一分量中，则返回true。
     */
    @Deprecated
    public boolean connected(int p, int q) {
        validate(p);
        validate(q);
        return id[p] == id[q];
    }

    /**
     * 合并
     */
    public void union(int p, int q) {
        validate(p);
        validate(q);

        //查询p,q触点的分量值
        int pID = find(p);
        int qID = find(q);

        // 如果p和q触点在一个分量中，则不采取任何操作
        if (pID == qID) return;

        //如果p和q触点不在一个分量中，则合并这两个分量，
        // 并将两个分量内的所有触点的分量值设置为qID
        for (int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        //合并分量后，分量数肯定减一
        count--;
    }

    /**
     * 输入一列整数进行动态连通性测试
     */
    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            //如果p和q在同一个分量中，则不采取任何操作，并跳过
            if (uf.find(p) == uf.find(q)) continue;
            //如果p和q触点不在一个分量中，则合并这两个分量，并输出打印这两个分量
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }

}

