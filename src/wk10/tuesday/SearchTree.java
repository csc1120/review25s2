package wk10.tuesday;

public interface SearchTree<E> {
    /**
     * Inserts item where it belongs in the tree.
     * @param item to insert
     * @return true if the items is inserted,
     * false if it wasn't (i.e., already in the tree)
     */
    boolean add(E item);

    /**
     * Returns true if the target is found in the tree
     * @param target element to search for
     * @return true if the target is found in the tree
     */
    boolean contains(E target);

    /**
     * Returns a reference to the data in the node that
     * is equal to target. If no such node is found,
     * returns null
     * @param target element to find
     * @return reference to the data in the node or null
     */
    E find(E target);

    /**
     * Removes target (if found) from tree and
     * returns it; otherwise returns null
     * @param target element to remove
     * @return target if found, else null
     */
    E delete(E target);

    /**
     * Removes target (if found) from tree and
     * returns true, otherwise returns false
     * @param target element to remove
     * @return true if target was found, else
     * false
     */
    boolean remove(E target);

}
