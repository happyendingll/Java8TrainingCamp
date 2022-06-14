import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("pwd", "Is", "Learning", "Java8", "In", "Action");
        Stream<String> s = title.stream();
        List<String> title2 = s.filter((a) -> a.length() > 5).collect(Collectors.toList());
        System.out.println(title2);
        Clock clock =Clock.systemDefaultZone();
        long millis= clock.millis();
        Instant instant =clock.instant();
        Date legacyDate =Date.from(instant);
        System.out.println(legacyDate);
        System.out.println(millis);
        var mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        var myMap = new HashMap<Integer,String>();
        myMap.put(1,"one");
        System.out.println(myMap);
        mylist.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }

}
