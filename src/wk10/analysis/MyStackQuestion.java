package wk10.analysis;

import java.util.ArrayList;
import java.util.List;

public class MyStackQuestion {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("foo");
        stack.push("bar");
        System.out.println(stack.peek());
        stack.push("taco");
        System.out.println(stack.pop());
        stack.push("cat");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push("hello");
        stack.push("world");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("how");

        List<String> words = new ArrayList<>();
        while(!stack.isEmpty()){
            words.add(stack.pop());
        }
        System.out.println(words);
    }
}
