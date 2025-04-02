package wk10.monday;

import wk10.tuesday.MyBinaryTree;

import java.util.function.BiConsumer;

public class TestMyBinaryTree {
    public static void main(String[] args) {
        MyBinaryTree<String> e1 = new MyBinaryTree<>();
        MyBinaryTree<String> e2 = new MyBinaryTree<>();
        MyBinaryTree<String> nodeX =
                new MyBinaryTree<>("x", e1, e2);

        MyBinaryTree<String> e3 = new MyBinaryTree<>();
        MyBinaryTree<String> e4 = new MyBinaryTree<>();
        MyBinaryTree<String> nodeY =
                new MyBinaryTree<>("y", e3, e4);

        System.out.println(nodeX.height());
        System.out.println(nodeY.height());

        MyBinaryTree<String> nodePlus =
                new MyBinaryTree<>("+", nodeX, nodeY);

        System.out.println("InOrder");
        BiConsumer<String, Integer> consumer = (data, depth) -> {
            System.out.println("-".repeat(depth) + data);
        };
        nodePlus.inOrderTraverse(consumer);
        System.out.println(nodePlus.height());
    }
}
