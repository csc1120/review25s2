package wk10.analysis;

/**
 * Interface for a simple stack
 * @param <E> type of the elements stored in the stack
 */
public interface PureStack<E> {
    /**
     * Returns true if the stack is empty
     * and false other wiese
     * @return True if the stack is empty, false otherswise
     */
    boolean isEmpty();

    /**
     * Returns the object at the top of the stack
     * w/o removing it
     * @return The object at the top of the stack
     * @throws java.util.NoSuchElementException if stack is empty
     */
    E peek();

    /**
     * Returns the object at the top of the stack
     * and removes it
     * @return The object at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    E pop();

    /**
     * Adds an item to the top of the stack
     * @param obj Item to be added to the stack
     * @return The item added to the top of teh stack
     */
    E push(E obj);

}
