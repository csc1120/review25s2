package wk10.analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<E> implements PureQueue<E> {

    private List<E> data;

    public MyQueue(){
        data = new LinkedList<>();
    }
    @Override
    public boolean offer(E item) {
        data.add(item);
        return true;
    }

    @Override
    public E remove() {
        if(data.isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        return data.remove(0);
    }
    @Override
    public E poll() {
        if(data.isEmpty()){
            return null;
        }
        return data.remove(0);
    }
    @Override
    public E element() {
        if(data.isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        return data.get(0);
    }
    @Override
    public E peek() {
        if(data.isEmpty()){
            return null;
        } else {
            return data.get(0);
        }
    }
}
