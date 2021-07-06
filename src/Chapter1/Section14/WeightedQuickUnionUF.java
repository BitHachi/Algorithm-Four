package Chapter1.Section14;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author: BitHachi
 * @create: 2021-03-17 14:51
 * @description:
 **/
public class WeightedQuickUnionUF {
    private int[] parent;   // parent[i] = parent 链接数组，每一个触点i对应的父触点为parent[i]
    private int[] size;     // size[i] = number 以i为根触点的的子树中元素的个数
    private int count;      // 分量的个数

    /**
     * 初始化每一个触点i对应的父触点数组parent
     * 每一个触点刚开始都是根触点，子树为自己，元素个数为1
     */
    public WeightedQuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    /**
     * Returns the number of sets.
     */
    public int count() {
        return count;
    }

    /**
     *  返回p触点的根触点名称
     */
    public int find(int p) {
        validate(p);
        while (p != parent[p])
            p = parent[p];
        return p;
    }

    /**
     * 如果两个元素在同一个集合中，则返回true。
     */
    @Deprecated
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * 两个分量进行合并
     */
    public void union(int p, int q) {
        //找到p触点的根触点
        int rootP = find(p);
        //找到q触点的根触点
        int rootQ = find(q);
        if (rootP == rootQ) return;
        System.out.print("rootP="+rootP+
                " rootQ="+rootQ+" --- ");
        // 使较小的树的根触点指向较大的树的根触点
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }


    /**
     * 输入一列整数进行动态连通性测试
     */
    public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        System.out.println("---parent-init---"+Arrays.toString(uf.parent));
        System.out.println("----size-init----"+Arrays.toString(uf.size));
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
            System.out.println("---parent--------"+Arrays.toString(uf.parent));
            System.out.println("----size---------"+Arrays.toString(uf.size));
        }
        StdOut.println(uf.count() + " components");
    }

}

