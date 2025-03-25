package wk9.tuesday;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E> {
    private class MyArrayIterator implements Iterator<E> {
        private int position;
        private boolean elementToRemove;

        public MyArrayIterator() {
            position = -1;
            elementToRemove = false;
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return position + 1 < size();
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException("No more elements for next()");
            }
            position += 1;
            elementToRemove = true;
            return data[position];
        }

        /**
         * Removes from the underlying collection the last element returned
         * by this iterator (optional operation).  This method can be called
         * only once per call to {@link #next}.
         * <p>
         * The behavior of an iterator is unspecified if the underlying collection
         * is modified while the iteration is in progress in any way other than by
         * calling this method, unless an overriding class has specified a
         * concurrent modification policy.
         * <p>
         * The behavior of an iterator is unspecified if this method is called
         * after a call to the {@link #forEachRemaining forEachRemaining} method.
         *
         * @throws UnsupportedOperationException if the {@code remove}
         *                                       operation is not supported by this iterator
         * @throws IllegalStateException         if the {@code next} method has not
         *                                       yet been called, or the {@code remove} method has already
         *                                       been called after the last call to the {@code next}
         *                                       method
         * @implSpec The default implementation throws an instance of
         * {@link UnsupportedOperationException} and performs no other action.
         */
        @Override
        public void remove() {
            if(!elementToRemove){
                throw new IllegalStateException();
            }
            MyArrayList.this.remove(position);
            position--;
            elementToRemove = false;
        }
    }

    private static final int INITIAL_CAPACITY = 3;

    private E[] data;
    private int size;
    private int capacity;

    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        data = (E[])new Object[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    private void reallocate(){
        capacity = capacity * 2;
        E[] newData = (E[]) new Object[capacity];
        for(int i = 0; i<size(); i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    private void checkIndex(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index "
                    +index+" for size of "+size());
        }
    }
    public E remove(int index){
        checkIndex(index);
        E ret = data[index];
        for(int i = index; i<size() - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return ret;
    }
    public boolean add(E item){
        if(size == data.length){
            reallocate();
        }
        data[size] = item;
        size++;
        return true;
    }
    public void add(int index, E item){
        if(size == capacity){
            reallocate();
        }
        //throws
        for(int i = size - 1; i >= index; i--){
            data[i+1] = data[i];
        }
        data[index] = item;
        size++;
    }
    public E get(int index){
        checkIndex(index);
        return data[index];
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<size; i++){
            sb.append(data[i]+" ");
        }
        sb.append("]");
        return sb.toString();
    }
    public Iterator<E> iterator(){
        return new MyArrayIterator();
    }
}
