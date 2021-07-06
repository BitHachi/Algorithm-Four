package Chapter1.Section14;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: BitHachi
 * @create: 2021-03-17 09:11
 * @description:
 **/
public class QuickUnionUF{
    private int[] id;  // 链接数组，每一个触点i对应的父触点为id[i]
    private int count;     // 分量的个数

    /**
     * Initializes an empty union-find data structure with
     */
    public QuickUnionUF(int n) {
        id = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    /**
     * Returns the number of sets.
     */
    public int count() {
        return count;
    }

    /**
     * 返回p触点的根触点名称
     */
    public int find(int p) {
        validate(p);
        while (p != id[p])
            p = id[p];
        return p;
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * 如果两个元素在同一集合根节点下，则返回true
     */
    @Deprecated
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     *将两个分量进行合并
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        id[rootP] = rootQ;
        count--;
    }

    /**
     * 输入一列整数进行动态连通性测试
     */
    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickUnionUF uf = new QuickUnionUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }


}
