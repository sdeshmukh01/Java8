import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by himu on 3/4/2018.
 */
public class StreamOps {

    public static void main(String[] args) {

        String[]arr = new String[]{"wo", "ol","l","l"};

        Stream<String> stream = Stream.of(arr);
        stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        stream.map(String::length).forEach(System.out::println);
//        stream.filter(a -> a.length()<2).distinct().forEach(System.out::println);
//
//        Stream s = Stream.iterate(1,  n->  n + 1);
//        s.skip(5).limit(12).forEach(System.out::println);
    }
}
