import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class test1 {
    @Test
    public void test() {
        System.out.println("Hello, World!");
    }

    @Test
    public void test2() {
        var list = new ArrayList<String>();
        Stream<String> stream = list.parallelStream();

        Arrays.asList("a", "b", "c").parallelStream().forEach(System.out::println);

        Stream.of("aa",'b','s').forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
