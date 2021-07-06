package Chapter1.Section13;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author: BitHachi
 * @create: 2021-03-12 10:38
 * @description:
 **/
public class ResizingArrayBag<Item> implements Iterable<Item> {
    // 背包数组的初始容量
    private static final int INIT_CAPACITY = 8;
    private Item[] a;         // 背包数组
    private int n;            // 背包的元素个数
    /**
     *初始化一个容量为INIT_CAPACITY的背包
     */
    public ResizingArrayBag() {
        a = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
    }
    /**
     * 如果背包是空的，则返回true，否则false
     */
    public boolean isEmpty() {
        return n == 0;
    }
    /**
     * 返回背包的元素个数
     */
    public int size() {
        return n;
    }
    // 调整背包数组的大小
    private void resize(int capacity) {
        //assert断言：相当于if语句，但是与if不同的是，如果条件不成立则终止程序运行
        //参考：https://www.runoob.com/w3cnote/c-assert.html
        assert capacity >= n;
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++)
            copy[i] = a[i];
        a = copy;
    }
    /**
     * Adds the item to this bag.
     */
    public void add(Item item) {
        if (n == a.length) resize(2*a.length);    // 如果背包已经装满，就扩容为原来的两倍
        a[n++] = item;                            // add item
    }
    /**
     * Returns an iterator that iterates over the items in the bag in arbitrary order.
     * 返回一个迭代器，它以任意顺序遍历包中的项。
     */
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }
    //实现背包数组的迭代器不实现remove（），因为背包不需要删除元素
    private class ArrayIterator implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext()  { return i < n;                               }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i++];
        }
    }
    /**
     * Unit tests the {@code ResizingArrayBag} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        ResizingArrayBag<String> bag = new ResizingArrayBag<String>();
        bag.add("Hello");
        bag.add("World");
        bag.add("how");
        bag.add("are");
        bag.add("you");
        bag.add("ad");
        bag.add("fgf");
        bag.add("gj");
        bag.add("jh");
        bag.add("jqwh");
        bag.add("trjrth");
        for (String s : bag)
            StdOut.println(s);
    }
}