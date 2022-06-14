import netscape.javascript.JSObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class test3 {
    List<Person> personList = Arrays.asList(
            new Person("张三", 18, 1293.01, Person.Status.Busy),
            new Person("李四", 25, 1293.01, Person.Status.Free),
            new Person("王五", 12, 1123.1023, Person.Status.Busy),
            new Person("赵六", 67, 123214.12038, Person.Status.Busy),
            new Person("赵六", 67, 123214.12038, Person.Status.Busy),
            new Person("赵六", 67, 12321.12038, Person.Status.Busy)
    );

    @Test
    public void test() {
        personList.stream().filter(e -> e.getAge() > 12).forEach(System.out::println);


    }

    @Test
    public void test2() {
        personList.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test3() {
        personList.stream().map(Person::getName).forEach(System.out::println);
        System.out.println("-------------");
        personList.stream().flatMap(e -> Arrays.stream(e.getName().split(","))).forEach(System.out::println);
    }

    @Test
    public void test4() {
        System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(2)));
        personList.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).forEach(System.out::println);
    }

    @Test
    public void test5() {
        personList.stream().sorted().forEach(System.out::println);
    }

    @Test
    public void test6() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer reduce = integerList.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);


        Integer reduce1 = personList.stream().map(Person::getAge).reduce(0, (x, y) -> x + y);
        System.out.println(reduce1);
    }

    @Test
    public void test7() {

        Collection<Person> collect = personList.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect);
    }

    @Test
    public void test8() {

        Map<Boolean, List<Person>> collect = personList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 7000));
        System.out.println(collect);
    }

    @Test
    public void test9() {


        Optional<Person> op = Optional.ofNullable(new Person("张三", 19));
        //Optional<Person> op = Optional.ofNullable(null);
        if (op.isPresent()) {
            System.out.println(op.get());
        }
        Person op2 = op.orElse(new Person("李四", 20));
        System.out.println(op2);

        Person op3 = op.orElseGet(() -> {
            System.out.println("进一步操作");
            return new Person("王五", 23);
        });
        System.out.println(op3);

        Optional<String> s = op.map(Person::getName);
        if (s.isPresent()) {
            System.out.println(s.get());
        }

        Optional<String> s1 = op.flatMap((e) -> Optional.ofNullable(e.getName()));
        if (s1.isPresent()) {
            System.out.println(s1.get());
        }
    }

    @Test
    public void test10() {
        DateTimeFormatter formatStyle = DateTimeFormatter.ISO_LOCAL_TIME;

        System.out.println(formatStyle);
    }

    @Test
    public void test11() throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "https://www.wdbyte.com");
        System.out.println(path);
    }

    @Test
    public void test12() throws IOException {
        String str = """
                  {
                        "userId": "12397",
                        "attractionId": "231132",
                        "score": 298
                  }
                  """;

        System.out.println(str);
    }
    @Test
    public void test13() {
        String str = "http://www.wdbyte.com";
        String s = str.replaceFirst("http.*://", "");
        System.out.println(s);
    }

    @Test
    public void test14()  {
        String relativelyPath=System.getProperty("user.dir");
        System.out.println(relativelyPath);
    }

}
