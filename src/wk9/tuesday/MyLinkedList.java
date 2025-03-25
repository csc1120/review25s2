package wk9.tuesday;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    //TODO This implementation of MyLinkedIterator is not efficent.
    // Can you explain why?
    private class MyLinkedIterator implements Iterator<E> {
        private int position;
        private boolean elementToRemove;

        public MyLinkedIterator() {
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
            return MyLinkedList.this.get(position);
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
            MyLinkedList.this.remove(position);
            position--;
            elementToRemove = false;
        }
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node(E element){
            this.element = element;
            next = null;
        }
        private Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
    Node<E> head;
    // int size;
    public MyLinkedList(){

    }
    public int size(){
        Node<E> walker = head;
        int count = 1;
        if(walker == null){
            count = 0;
        } else {
            while (walker.next != null) {
                walker = walker.next;
                count++;
            }
        }
        return count;
    }

    public boolean add(E element){
        if(head == null){
            head = new Node<>(element);
        } else {
            Node<E> last = getNode(size() - 1);
            last.next = new Node<>(element);
        }
        return true;
    }
    private Node<E> getNode(int index){
        Node<E> walker = head;
        for(int i = 0; i<index; i++){
            walker = walker.next;
        }
        return walker;
    }
    public E get(int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Invalid index "+index+" for size() "+size());
        }
        return getNode(index).element;
    }
    public E remove(int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Invalid index "+index+" for size() "+size());
        }
        //if the index is 0
        if(index == 0){
            head = head.next;
            Node<E> ret = head;
            return ret.element;
        } else {
            //if the size is more than 1
            Node<E> prev = getNode(index - 1);
            Node<E> curr = getNode(index);
            Node<E> next = curr.next;
            prev.next = next;
            return curr.element;
        }


    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int s = size();
        for(int i = 0; i<s; i++){
            sb.append(get(i) + " ");
        }
        sb.append("]");
        return sb.toString();
    }

}
