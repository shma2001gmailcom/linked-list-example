package org.misha;

public class MyLinkedList<T> implements MyList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(T data) {
        Node<T> node = new Node<>();
        node.setData(data);
        if (size == 0) {
            tail = head = node;
            size = 1;
        } else {
            tail.setNext(node);
            tail = node;
            ++size;
        }
    }

    @Override
    public T pop() {
        T data = head.getData();
        head = head.next();
        --size;
        return data;
    }

    @Override
    public boolean insert(int i, T data) {
        if (0 <= i && i < size) {
            Node<T> newNode = new Node<>();
            newNode.setData(data);
            if (head == null) {
                push(data);
                size = 1;
                return true;
            }
            if (i == 0) {
                Node<T> temp = head;
                head = newNode;
                newNode.setNext(temp);
                ++size;
                return true;
            }
            Node<T> node = head;
            int offset = 0;
            while (offset < i) {
                ++offset;
                node = node.next();
            }
            Node<T> temp = node.next();
            node.setNext(newNode);
            newNode.setNext(temp);
            ++size;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(final int pos) {
        throw new RuntimeException("implement me");
    }

    @Override
    public T get(final int pos) {
        throw new RuntimeException("implement me");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (head == null) {
            sb.append("]");
        } else {
            Node<T> node = head;
            for (; node.hasNext(); node = node.next()) {
                sb.append(node.getData()).append(", ");
            }
            sb.append(node).append("]");
        }
        return sb.toString();
    }
}