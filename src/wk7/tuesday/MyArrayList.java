package wk7.tuesday;

public class MyArrayList <E> {

    private static final int INITIAL_CAPACITY = 3;
    private int capacity;
    private int size;
    private E[] data;

    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(E e){
        if(size == capacity){
            reallocate();
        }
        data[size] = e;
        size++;
        return true;
    }
    public void add(int index, E e){

        if(size == capacity){
            reallocate();
        }
        for (int i = size; i>index; i--){
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }
    public E remove(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException(
                    "Invalid index "+index+" for size of "+size());
        }
        E ret = data[index];
        for(int i = index + 1; i < size;i++){
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }
    private void reallocate(){
        E[] newData = (E[]) new Object[2 * capacity];
        for(int i = 0; i<data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
        capacity = data.length;
    }
    public E get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException(
                    "Invalid index "+index+" for size of "+size());
        }
        return data[index];
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<size(); i++){
            sb.append(data[i] + " ");
        }
        sb.append("]");
        return sb.toString();
    }

}
