package wk5.prep;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourcesExamples {
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "taco", "cat"};

        Arrays.stream(words).map(a -> a.charAt(0)).forEach(System.out::println);

        String msg = "Hello how are you doing?";
        Arrays.stream(msg.split("\\s+")).map(a -> a.toUpperCase()).forEach(System.out::println);
        try {
            Files.lines(Path.of("data/goodNums1.txt")).
                    map(a -> 2 * Integer.parseInt(a.trim())).forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Error reading the file");
        }

    }
}
