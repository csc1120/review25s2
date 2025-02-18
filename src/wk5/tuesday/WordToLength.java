package wk5.tuesday;

import java.util.function.Function;

public class WordToLength implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
