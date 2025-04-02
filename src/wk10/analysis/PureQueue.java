package wk10.analysis;

import java.util.NoSuchElementException;

/**
 * Interface for a pure queue
 * @param <E> type of the element in the queue
 */
public interface PureQueue<E> {
    /**
     * adds item to the end of the queue. Returns true is successful
     * @param item element to add to the end of the queue
     * @return true is successfully added
     */
    boolean offer(E item);

    /**
     * removes element from the front of the queue
     * and returns it
     * @throws NoSuchElementException if empty
     * @return element that was removed
     */
    E remove();

    /**
     * removes element from the front of the queue and returns it
     * Returns null if the list is empty
     * @return element from the front of the queue or null if
     * the queue is empty
     */
    E poll();

    /**
     * returns the element at the front of the queue w/o removing it
     * @throws NoSuchElementException if empty
     * @return element at the front of the queue
     */
    E element();

    /**
     * Return the element at the front of the queue w/o removing it
     * Returns null is the list is empty
     * @return element at the front of the queue or null if the queue
     * is empty
     */
    E peek();
}
