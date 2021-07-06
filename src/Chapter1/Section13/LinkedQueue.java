package Chapter1.Section13;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class LinkedQueue<Item> implements Iterable<Item> {
    private int n;         // 队列元素个数
    private Node first;    //  队首
    private Node last;     //  队尾

    // 链表结点
    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * 初始化空链表
     */
    public LinkedQueue() {
        first = null;
        last  = null;
        n = 0;
    }

    /**
     * Is this queue empty?
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     */
    public int size() {
        return n;
    }

    /**
     *  单纯返回队首元素
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("队列已空");
        return first.item;
    }

    /**
     *  入队：添加元素到队尾
     */
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else   oldlast.next = last;
        n++;
    }

    /**
     *  出队：返回队首元素
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("队列已空");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // 避免游荡，浪费内存
        return item;
    }

    /**
     * 返回此队列的字符串表示形式。
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }

    /**
     * 返回一个迭代器，该迭代器以FIFO顺序遍历此队列中的元素。
     */
    public Iterator<Item> iterator()  {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    /**
     * 我们输入字符串：to be or not to - be - - that - - - is 进行测试。
     */
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
        while (!queue.isEmpty()){
            StdOut.print(queue.dequeue() + " ");
        }
    }
}

