package wk8.tuesday;

public class MyLinkedDriver {
    public static void main(String[] args) {
        MyLinkedList<String> words = new MyLinkedList<>();
        System.out.println(words.size()); //0
        words.add("foo");
        System.out.println(words.size()); //1
        words.add("bar");
        System.out.println(words.size()); //2
        words.add("taco");
        System.out.println(words.size()); //3
        int s = words.size();
//        for(int i = 0; i < s; i++){
//            System.out.println(words.get(i));
//        }

        words.add("cat");
        words.remove(0);
        for(int i = 0; i < s; i++){
            System.out.println(words.get(i));
        }

    }
}
