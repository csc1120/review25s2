package wk10.tuesday;

import java.util.function.BiConsumer;

public class MyBinarySearchTree<E extends Comparable<E>>
        extends MyBinaryTree<E> implements SearchTree<E> {

    /**
     * Keeps track of whether something was
     * added during add()
     */
    protected boolean addReturn;
    /**
     * Keeps track of whether something was
     * removed during remove()
     */
    protected boolean addRemove;

    public MyBinarySearchTree(E data,
                              MyBinarySearchTree<E> left,
                              MyBinarySearchTree<E> right) {
        super(data, left, right);
    }
    public MyBinarySearchTree() {
        this(null, null, null);
    }

    /**
     * Inserts item where it belongs in the tree.
     *
     * @param item to insert
     * @return true if the items is inserted,
     * false if it wasn't (i.e., already in the tree)
     */
    @Override
    public boolean add(E item) {
        return false;
    }



    /**
     * Returns true if the target is found in the tree
     *
     * @param target element to search for
     * @return true if the target is found in the tree
     */
    @Override
    public boolean contains(E target) {
        return false;
    }

    /**
     * Returns a reference to the data in the node that
     * is equal to target. If no such node is found,
     * returns null
     *
     * @param target element to find
     * @return reference to the data in the node or null
     */
    @Override
    public E find(E target) {
        return find(root, target);
    }

    private E find(Node<E> root, E target){
        if(root == null){
            return null;
        } else {
            if(target.compareTo(root.data) == 0){
                return root.data;
            } else if(target.compareTo(root.data) < 0){
                return find(root.left, target);
            } else {
                return find(root.right, target);
            }
        }
    }

    /**
     * Removes target (if found) from tree and
     * returns it; otherwise returns null
     *
     * @param target element to remove
     * @return target if found, else null
     */
    @Override
    public E delete(E target) {
        return null;
    }

    /**
     * Removes target (if found) from tree and
     * returns true, otherwise returns false
     *
     * @param target element to remove
     * @return true if target was found, else
     * false
     */
    @Override
    public boolean remove(E target) {
        return false;
    }

    public void inOrderTraverse(BiConsumer<E, Integer> consumer){
        inOrderTraverse(root, 1, consumer);
    }
    public void inOrderTraverse(Node<E> root, int depth, BiConsumer<E, Integer> consumer){
        if(root == null){
            consumer.accept(null, depth);
        } else {
            //Inorder Traversal
            //traverse T_L
            //evaluate(T_root)
            //traverse T_R
            inOrderTraverse(root.left, depth + 1, consumer);
            consumer.accept(root.data, depth);
            inOrderTraverse(root.right, depth + 1, consumer);
        }
    }
}
