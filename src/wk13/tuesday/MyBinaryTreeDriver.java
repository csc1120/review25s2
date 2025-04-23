package wk13.tuesday;

import java.util.function.Consumer;

public class MyBinaryTreeDriver {
    public static void main(String[] args) {

        MyBinaryTree<String> treeX =
                new MyBinaryTree<>("x" ,
                        new MyBinaryTree<>() ,
                        new MyBinaryTree<>());
        MyBinaryTree<String> treeA =
                new MyBinaryTree<>("a",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());
        MyBinaryTree<String> treeMult =
                new MyBinaryTree<>("*",
                        new MyBinaryTree<>(),
                        new MyBinaryTree<>());
        MyBinaryTree<String> treeB =
                new MyBinaryTree<>("b",
                        new MyBinaryTree<>(),
                        treeMult);
        MyBinaryTree<String> treeDivide =
                new MyBinaryTree<>("/", treeA, treeB);
        MyBinaryTree<String> treeY =
                new MyBinaryTree<>("y" ,
                        new MyBinaryTree<>() ,
                        treeDivide);
        MyBinaryTree<String> treePlus =
                new MyBinaryTree<>("+", treeX, treeY);
        System.out.println(treePlus);
        Consumer<String> consumer1 = (data) -> {
            System.out.print("_"+data.toUpperCase()+"_");
        };
        Consumer<String> consumer2 = (data) -> {
            System.out.print("^"+data.toUpperCase()+"^");
        };
        treePlus.preOrderTraversal(consumer1);
        treePlus.preOrderTraversal(consumer2);
        String target = "+";
        Consumer<String> findData = (data) ->{
            if(data.equals(target)){
                System.out.println("Found the data!!!");
            }
        };
        treePlus.preOrderTraversal(findData);







//
//
//        MyBinaryTree<String> treeMult =
//                new MyBinaryTree<>("*", treePlus, treeDivide);
//
//
//        System.out.println("toString");
//        System.out.println(treeMult);
//
//        BiConsumer<String, Integer> consumer =
//        (String data, Integer depth) ->{
//            System.out.println("-".repeat(depth) + data);
//        };
//        System.out.println("consumer");
//        treeMult.inOrderTraverse(consumer);
    }
}
