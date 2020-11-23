package org.misha;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node<T> next() {
        return next;
    }

    public void setNext(final Node<T> node) {
        next = node;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }


    boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
