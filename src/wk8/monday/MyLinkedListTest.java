package wk8.monday;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> words = new MyLinkedList<>();
        System.out.println(words.size());
        words.add("foo");
        System.out.println(words.size());
        words.add("bar");
        System.out.println(words.size());
        words.add("taco");
        System.out.println(words.size());

        for(int i = 0; i< words.size(); i++){
            System.out.println(words.get(i));
        }
        System.out.println(words);

    }
}
