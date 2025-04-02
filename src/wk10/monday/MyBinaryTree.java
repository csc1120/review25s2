package wk10.monday;

import java.util.function.BiConsumer;

public class MyBinaryTree<E> {
    protected static class Node<E>{
        protected E data;
        protected Node<E> left;
        protected Node<E> right;
        public Node(E data){
            this.data = data;
        }
        public String toString(){
            return data.toString();
        }
    }
    protected Node<E> root;
    public MyBinaryTree(){
        this.root = null;
    }

    public MyBinaryTree(E data,
                        MyBinaryTree<E> left,
                        MyBinaryTree<E> right){
        this.root = new Node<>(data);
        root.left = left != null ? left.root : null;
        root.right = right != null ? right.root : null;
    }
    protected MyBinaryTree(Node<E> root){
        this.root = root;
    }

    public MyBinaryTree<E> getLeftSubtree(){
        if(root != null && root.left != null){
            return new MyBinaryTree<>(root.left);
        } else {
            return null;
        }
    }
    public E getData(){
        if(root != null){
            return root.data;
        } else {
            return null;
        }
    }
    public boolean isLeaf(){
        return root.left == null && root.right == null;
    }


    public String toString(){
        return toString(root, 1);

    }
    private String toString(Node<E> root, int depth){
        String ret = "";
        if(root == null){
            return "-".repeat(depth) + "null\n";
        } else {
            ret += toString(root.left, depth + 1);
            ret += "-".repeat(depth) + root.toString() +"\n";
            ret += toString(root.right, depth + 1);
            return ret;
//            return toString(root.left) + " "
//                    +" " + root.toString() +
//                    toString(root.right);
        }
    }

    /**
     * Wrapper method for inOrderTraverse
     * Performs an inOrderTraverse of the tree and uses
     * the accept() method of the passed-in consumer
     * object to evaluate each node.
     * @param consumer BiConsumer of type E and Integer where
     * E is the data type of this tree and Integer is the
     * depth of a node
     */
    public void inOrderTraverse(BiConsumer<E, Integer> consumer){
        inOrderTraverse(consumer, root, 1);
    }
    private void inOrderTraverse(BiConsumer<E, Integer> consumer,
                                 Node<E> root, int depth){
        if(root == null){
            consumer.accept(null, depth);
        } else {
            inOrderTraverse(consumer, root.left, depth + 1);
            consumer.accept(root.data, depth);
            inOrderTraverse(consumer, root.right, depth + 1);
        }
    }

    /**
     * Wrapper method for size()
     * Returns the size of the tree. An empty
     * tree should return a size of 0.
     * @return size of the tree
     */
    public int size(){
        return size(root);
    }
    public int size(Node<E> root){
        if(root == null){
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }

    /**
     * Returns the height of the tree. The
     * height of the tree is the longest path
     * from the root to any leaf node. In
     * other words it is the max depth of
     * any leaf node. An empty tree has a
     * height of 0.
     * @return height of the tree
     */
    public int height(){
        return 0;
    }


}
