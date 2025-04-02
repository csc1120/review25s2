package wk10.analysis;

import java.util.ArrayList;
import java.util.List;

public class CircularQueueQuestion {
    public static void main(String[] args) {
        PureQueue<String> queue = new CircularQueue<>();

        queue.offer("foo");
        queue.offer("bar");
        System.out.println(queue.peek());
        queue.offer("taco");
        queue.offer("cat");
        System.out.println(queue.poll());
        queue.offer("hello");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.offer("world");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.offer("how");

        List<String> words = new ArrayList<>();
        while (queue.peek() != null){
            words.add(queue.poll());
        }
        System.out.println(words);
    }
}
