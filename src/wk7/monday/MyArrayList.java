package wk7.monday;

public class MyArrayList<E> {
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





}
