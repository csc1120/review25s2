package wk13.tuesday;

import wk13.monday.MyBinaryTree;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyBinaryTreeFind {
    public static void main(String[] args) {
        MyBinaryTree<String> treeA =
                new MyBinaryTree<>("a",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());
    MyBinaryTree<String> treeB =
            new MyBinaryTree<>("b",
                    new MyBinaryTree<>(),
                    treeA);
    MyBinaryTree<String> treeC =
            new MyBinaryTree<>("c",
                    new MyBinaryTree<>(),
                    treeB);
        MyBinaryTree<String> treeD =
                new MyBinaryTree<>("d",
                        new MyBinaryTree<>(),
                        treeC);
        System.out.println(treeD);
        ArrayList<String> found = new ArrayList<>();
        String target = "z";
        Consumer<String> findStuff = (s) ->{
            if(s.equals(target)){
                found.add(s);
            }
        };
        treeD.InOrderTraversal(findStuff);
        System.out.println(found);

}
}
