package Chapter1.Section13;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayQueue<Item> implements Iterable<Item> {
    // 初始化队列的容量为8
    private static final int INIT_CAPACITY = 8;
    private Item[] q;       // 队列数组
    private int n;          // 队列内元素的个数
    private int first;      // 队首
    private int last;       // 队尾

    /**
     * Initializes an empty queue.
     */
    public ResizingArrayQueue() {
        q = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
        first = 0;
        last = 0;
    }

    /**
     * Is this queue empty?
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of items in this queue.
     */
    public int size() {
        return n;
    }

    // 调整队列容量大小
    private void resize(int capacity) {
        assert capacity >= n;
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            //将原来队列中的元素全部向前排列，从0开始排
            copy[i] = q[(first + i) % q.length];
        }
        q = copy;
        first = 0;
        last  = n;
    }

    /**
     * 入队：添加元素到队尾
     */
    public void enqueue(Item item) {
        // 如果队列元素个数等于容量大小，则容量扩增两倍
        if (n == q.length) resize(2*q.length);
        q[last++] = item; // add item
        //循环队列：
        // 如果队尾标志last值到了数组末尾，则将last=0。
        // 如果有元素入队，数组会扩增resize，不影响。
        // 如果有之后有元素出队，因为是循环队列，元素出队之后，last=0的位置空了，就可以再入队元素
        if (last == q.length) last = 0;          // wrap-around
        n++;
    }

    /**
     * 出队：返回队首元素
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("队列已空");
        Item item = q[first];
        q[first] = null;                            // 避免数据游离，浪费内存
        n--;
        first++;
        //如果first==q.length，代表所有元素都出队了，first要重置为0
        if (first == q.length) first = 0;           // wrap-around
        // 如果队列元素个数小于容量的1/4，则容量缩小为原来的一半
        if (n > 0 && n == q.length/4) resize(q.length/2);
        return item;
    }

    /**
     * 单纯返回队首元素
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("队列已空");
        return q[first];
    }


    /**
     * 返回一个迭代器，该迭代器以FIFO顺序遍历此队列中的元素。
     */
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext()  { return i < n;                               }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = q[(i + first) % q.length];
            i++;
            return item;
        }
    }

    /**
     *我们输入字符串：to be or not to - be - - that - - - is 进行测试。
     */
    public static void main(String[] args) {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) queue.enqueue(item);
            else if (!queue.isEmpty()) StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
        while (!queue.isEmpty()){
            StdOut.print(queue.dequeue() + " ");
        }
    }

}

