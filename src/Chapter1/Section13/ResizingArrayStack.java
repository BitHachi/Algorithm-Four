package Chapter1.Section13;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class ResizingArrayStack<Item> implements Iterable<Item> {

    // 栈数组的初始容量
    private static final int INIT_CAPACITY = 8;

    private Item[] a;         // 栈数组
    private int n;            // 栈的元素个数


    /**
     * Initializes an empty stack.
     */
    public ResizingArrayStack() {
        a = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
    }

    /**
     * Is this stack empty?
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of items in the stack.
     */
    public int size() {
        return n;
    }


    // 调整栈数组容量
    private void resize(int capacity) {
        assert capacity >= n;

        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = a[i];
        }
        a = copy;
        // 也可用这一行代码替代resize函数的功能
        // a = java.util.Arrays.copyOf(a, capacity);
    }



    /**
     * 添加元素到栈顶
     */
    public void push(Item item) {
        if (n == a.length) resize(2*a.length);    // double size of array if necessary
        a[n++] = item;                            // add item
    }

    /**
     * 栈顶元素出栈
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = a[n-1];
        a[n-1] = null;
        n--;
        if (n > 0 && n == a.length/4) resize(a.length/2);
        return item;
    }


    /**
     * 单纯返回栈顶元素
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return a[n-1];
    }

    /**
     * Returns an iterator to this stack that iterates through the items in LIFO order.
     */
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i;

        public ReverseArrayIterator() {
            i = n-1;
        }

        public boolean hasNext() {
            return i >= 0;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }
    }


    /**
     * 我们输入字符串：to be or not to - be - - that - - - is 进行测试。
     */
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) stack.push(item);
            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
        }
        StdOut.println("(" + stack.size() + " left on stack)");
        while (!stack.isEmpty()){
            StdOut.print(stack.pop() + " ");
        }
    }
}
