package wk10.monday;

import java.util.*;

public class MyLinkedList<E> implements List<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        private Node(E element) {
            this(element, null);
        }

        private Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
    private class MyLinkedListIterator implements Iterator<E> {
        private boolean elementToRemove;
        private Node<E> current;
        private Node<E> previous;

        public MyLinkedListIterator(){
            elementToRemove = false;
            current = null;
            previous = null;
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
            return current == null && head != null
                    || current != null && current.next != null;
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
                throw new NoSuchElementException("No next element");
            }
            previous = current;
            if(current == null){
                current = head;
            } else {
                current = current.next;
            }
            elementToRemove = true;
            return current.element;
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
                throw new IllegalStateException("need to call next() before remove");
            } else {
                if(current == head) {
                    head = head.next;
                } else {
                    //Node<E> previous = getNode(position - 1);
                    previous.next = current.next;
                }
                size--;
                current = previous;
                elementToRemove = false;
            }
        }
    }

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList() {
        size = 0;
    }

    /**
     * Returns the number of elements in the List
     * @return number of elements in the List
     */
    public int size() {
        int count = 0;
        for(Node<E> walker = head; walker != null; walker = walker.next){
            count++;
        }
        return count;

        //return size;
    }

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Removes all of the elements from this list
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Finds the node at the specific position
     *
     * @param index position of the node sought
     * @return node at the index or null if it does not exist
     */
    private Node<E> getNode(int index) {
        Node<E> walker = head;
        int count = 0;
        while (walker != null && count < index) {
            walker = walker.next;
            count++;
        }
        return walker;
    }

    /**
     * Creates a new node with the passed in element and
     * adds that node to the end of the list
     *
     * @param e element to add
     * @return true if the element was successfully added
     */
    public boolean add(E e) {
        Node<E> temp = new Node<>(e);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
        return true;
    }


    /**
     * Adds the element to the specified index
     *
     * @param index location to add the element
     * @param e     element to add
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == size) {
            add(e);
        } else {
            Node<E> temp = new Node<>(e);
            if (index == 0) {
                temp.next = head;
                head = temp;
            } else {
                Node<E> prev = getNode(index - 1);
                Node<E> curr = prev.next;
                temp.next = curr;
                prev.next = temp;
            }
            size++;
        }
    }

    /**
     * Returns the data at the node at the specific index
     *
     * @param index of the node
     * @return data at the node at the specific index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index " + index + " for size " + size);
        }
        return getNode(index).element;
    }
    /**
     * Removes the element at the specified index
     *
     * @param index index of the element to remove
     * @return element that was removed
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public E remove(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        E ret;
        if(index == 0){
            ret = head.element;
            head = head.next;
        } else {
            Node<E> curr = getNode(index);
            Node<E> prev = getNode(index - 1);
            prev.next = prev.next.next;
            ret = curr.element;
        }
        size--;
        return ret;
    }

    /**
     * Sets the element at the specified index with the passed-in element
     * @param index index of the element to replace
     * @param e element to be stored at the specified position
     * @return Previous element at the specified index
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public E set(int index, E e) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index " + index + " for size " + size);
        }
        Node<E> target = getNode(index);
        E ret = target.element;
        target.element = e;
        return ret;
    }

    /**
     * Finds the index of the first occurence of the
     * passed in Object or -1 if the object is not present
     *
     * @param obj Object to find
     * @return index of first occurence of the object
     * or -1 if the object is not present
     */
    public int indexOf(Object obj) {
        int ret = -1;
        for (int i = 0; i < size && ret == -1; i++) {
            if (Objects.equals(getNode(i).element, obj)) {
                ret = i;
            }
        }
        return ret;
    }
    /**
     * Finds the index of the first occurence of the
     * passed in Object or -1 if the object is not present
     * @param obj Object to find
     * @return index of first occurence of the object
     * or -1 if the object is not present
     */
    public int indexOfFast(Object obj) {
        Node<E> walker = head;
        int ret = -1;
        int i = 0;
        while(walker != null && ret == -1){
            if(Objects.equals(walker.element, obj)){
                ret = i;
            }
            walker = walker.next;
            i++;
        }
        return ret;
    }
    /**
     * Finds the index of the first occurence of the
     * passed in Object or -1 if the object is not present
     * @param obj Object to find
     * @return index of first occurence of the object
     * or -1 if the object is not present
     */
    public int indexOfItr(Object obj) {
        Iterator<E> it = iterator();
        int ret = -1;
        int i = 0;
        while(it.hasNext() && ret == -1){
            if(Objects.equals(it.next(), obj)){
                ret = i;
            }
            i++;
        }
        return ret;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(get(i));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }




    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }


}
