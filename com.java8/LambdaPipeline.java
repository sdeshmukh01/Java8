import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by himu on 3/4/2018.
 */
public class LambdaPipeline {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("tobi", "mack", "Jason", "Mike");

//        System.out.println(stream.collect(Collectors.averagingInt(String::length)));

//    Map map = stream.collect(Collectors.toMap(String::length, k -> k, (s1, s2)-> s1+", "+s2, TreeMap::new));
//        Map map = stream.collect(Collectors.groupingBy(String::length));
//        TreeMap<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()  ));
       Map
               map= stream.collect(Collectors.partitioningBy(s -> s.length() >4));

        System.out.println(map      );
    }



}
