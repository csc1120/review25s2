package wk10.tuesday;

import java.util.function.BiConsumer;

public class TestBinarySearchTree {
    public static void main(String[] args) {

        MyBinarySearchTree<String> tree = new MyBinarySearchTree<>();
        tree.add("foo");
        tree.add("bar");
        tree.add("taco");
        tree.add("cat");
        BiConsumer<String, Integer> consumer = (data, depth) -> {
            System.out.println("-".repeat(depth) + data);
        };
        tree.inOrderTraverse(consumer);
    }
}
