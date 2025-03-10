package wk7.monday;

public class MyArrayListDriver {
    public static void main(String[] args) {
        //ArrayList<String> words = new ArrayList<>();
        MyArrayList<String> words = new MyArrayList<>();
        System.out.println("Size before");
        System.out.println(words.size());
        words.add("foo");
        words.add("bar");
        System.out.println("Size after");
        System.out.println(words.size());
        System.out.println(words);

        System.out.println(words.get(0));
        System.out.println(words.get(1));

        words.add("taco");
        words.add("cat");
        words.add("hello");
        words.add("world");
        System.out.println(words);
        System.out.println("Insert into the middle");
        //will test removing from
        //middle and shifting to middle
        words.add(words.size()/2, "insert1");
        System.out.println(words);

        System.out.println("Add to the front");
        words.add(0, "insert2");
        System.out.println(words);

        System.out.println("Remove from back");
        words.add(words.size(), "insert3");
        System.out.println(words);

    }
}
