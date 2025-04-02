package wk10.analysis;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements PureQueue<E> {

    private int INITIAL_CAPACITY = 5;
    private int capacity;
    private E[] data;
    private int size;
    private int front;
    private int end;

    public CircularQueue(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[capacity];
        size = 0;
        front = 0;
        end = -1;
    }

    public void reallocate(){
        capacity = capacity * 2;
        E[] temp = (E[]) new Object[capacity];
        int j = 0;
        for(int i =0; i<size; i++) {
            temp[j] = data[(front + i) % size];
            j++;
        }
        data = temp;
        front = 0;
        end = size - 1;
    }
    @Override
    public boolean offer(E item) {
        if(size >= capacity){
            reallocate();
        }
        end = (end + 1) % capacity;
        data[end] = item;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(size == 0){
            throw new NoSuchElementException("queue is empty");
        }
        E ret = data[front];
        front = (front + 1) % capacity;
        size--;
        return ret;
    }
    @Override
    public E poll() {
        if(size == 0){
            return null;
        }
        E ret = data[front];
        front= (front + 1) % capacity;
        size--;
        return ret;
    }

    @Override
    public E element() {
        if(size == 0){
            throw new NoSuchElementException("queue is empty");
        }
        E ret = data[front];
        return ret;
    }



    @Override
    public E peek() {
        if(size == 0){
            return null;
        }
        E ret = data[front];
        return ret;
    }
}
