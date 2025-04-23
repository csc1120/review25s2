package wk13.monday;

import wk13.tuesday.MyPrinterStars;
import wk13.tuesday.MyPrinterUnderScore;
import wk13.tuesday.MyPrinterUppercase;

import java.util.function.Consumer;

public class MyBinaryTreeDriver {
    public static void main(String[] args) {
        MyBinaryTree<String> treeX =
                new MyBinaryTree<>("x",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());
        MyBinaryTree<String> treeY =
                new MyBinaryTree<>("y",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());
        MyBinaryTree<String> treePlus =
                new MyBinaryTree<>("+",
                        treeX,
                        treeY);

        System.out.println(treePlus);
        //Consumer<String> printer = new MyPrinterUppercase();
        //Consumer<String> printer = new MyPrinterUnderScore();
        //Consumer<String> printer = new MyPrinterStars();
        Consumer<String> printer = (s) -> {
            System.out.println("^"+s+"^");
        };
        treePlus.InOrderTraversal(printer);
    }
}
