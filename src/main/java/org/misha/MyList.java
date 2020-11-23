package org.misha;

public interface MyList<T> {
    int size();

    void push(T data);

    T pop();

    boolean insert(int pos, T data);

    boolean delete(int pos);

    T get(int pos);
}
