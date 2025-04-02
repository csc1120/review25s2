package wk10.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack<E> implements PureStack<E> {

    private List<E> data;

    public MyStack(){
        data = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return data.get(data.size()-1);
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return data.remove(data.size()-1);
    }

    @Override
    public E push(E obj) {
        data.add(obj);
        return obj;
    }
}
