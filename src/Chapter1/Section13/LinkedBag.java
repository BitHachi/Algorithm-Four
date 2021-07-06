package Chapter1.Section13;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedBag<Item> implements Iterable<Item> {
    private Node first;    // 背包链表头
    private int n;               // 背包的元素个数

    // 背包节点，这里使用链表实现背包
    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * 初始化一个空的背包链表
     */
    public LinkedBag() {
        first = null;
        n = 0;
    }

    /**
     * 如果背包是空的，则返回true，否则false
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 返回背包的元素个数
     */
    public int size() {
        return n;
    }

    /**
     * 添加一个元素到背包链表中
     * 采用头插法
     */
    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * 返回一个迭代器，该迭代器按任意顺序遍历背包中的元素。
     */
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }

    // 实现背包链表的迭代器不实现remove（），因为背包不需要删除元素
    private class LinkedIterator implements Iterator<Item> {
        private Node current;

        // creates a new iterator
        public LinkedIterator() {
            current = first;
        }

        // is there a next item in the iterator?
        public boolean hasNext() {
            return current != null;
        }

        // this method is optional in Iterator interface
        public void remove() {
            throw new UnsupportedOperationException();
        }

        // returns the next item in the iterator (and advances the iterator)
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * 从标准输入中读取一个实数序列，并打印出它们的均值和标准差
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // 读取输入的数字
        LinkedBag<Double> numbers = new LinkedBag<Double>();
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }
        int n = numbers.size();
        //计算样本均值
        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum / n;
        // 计算样本标准差
        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double stddev = Math.sqrt(sum / (n - 1));
        StdOut.printf("Mean:    %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", stddev);
    }
}