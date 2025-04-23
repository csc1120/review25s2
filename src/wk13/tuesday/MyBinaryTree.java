package wk13.tuesday;

import java.util.function.Consumer;

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
                        MyBinaryTree<E> leftTree,
                        MyBinaryTree<E> rightTree){
        this.root = new Node<>(data);
        if(leftTree != null){
            root.left = leftTree.root;
        }
        if(rightTree != null){
            root.right = rightTree.root;
        }
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
        return  toString(root);
    }

    private String toString(Node<E> localRoot){
        if(localRoot == null){
            return "";
        } else {
            //InOrder
            //go right
            StringBuilder sb = new StringBuilder();
            //go left
            sb.append(toString(localRoot.left));
            //Evaluate root
            sb.append(localRoot.data.toString());
            //go right
            sb.append(toString(localRoot.right));
            return sb.toString();
        }
    }
    public void preOrderTraversal(Consumer<E> consumer){
        preOrderTraversal(root, consumer);
    }
    public void preOrderTraversal(Node<E> localRoot,
                                  Consumer<E> consumer){
        if(localRoot != null){
            //preordre
            consumer.accept(localRoot.data);
            //evalute root
            //left
            preOrderTraversal(localRoot.left, consumer);
            //right
            preOrderTraversal(localRoot.right, consumer);
        }
    }

}
