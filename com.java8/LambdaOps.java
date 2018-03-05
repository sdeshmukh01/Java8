import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.*;

/**
 * Created by himu on 3/4/2018.
 */
public class LambdaOps {


    String walk = "walk";

    void everyOnePlay(boolean baby) {
        String approach = "amble";
        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
            System.out.println(s1.get());
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s2.get());
        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();
        System.out.println(s3.get().append(1));
        System.out.println(s4.get());
        Supplier<ArrayList> s5 = ArrayList::new;
        s5.get().add(1);
//        System.out.println(s5.get().get(0));
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("test");
        c2.accept("testagain");
        Map<Integer, Integer> map = new HashMap();
        BiConsumer<Integer, Integer> b1 = map::put;
        BiConsumer<Integer, Integer> b2 = (v, u)-> map.put(v, u);
        b1.accept(1,2);
        b2.accept(3, 4);
        System.out.println(map);
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = s -> s.isEmpty();

        System.out.println(p1.test("test"));
        System.out.println(p2.test(""));
        BiPredicate<String, String> bp1 = String::startsWith;
        BiPredicate<String, String> bp2 = (a, b) -> a.startsWith(b);
        BiPredicate<Integer, Integer> bp3 = (a1, a2) -> 0==a1.compareTo(a2);
        System.out.println(bp1.test("abcd", "a"));
        System.out.println(bp2.test("a", "abcdxx"));
        System.out.println(bp3.test(1,1));

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.length();

        System.out.println(f1.apply("test"));
        System.out.println(f2.apply("copy"));

        BiFunction<String, String, String> bf1 = String::concat;
        BiFunction<String, String, String> bf2 = (s01,s02) -> s01.concat(s02);

        System.out.println(bf1.apply("tasty", "chicken"));
        System.out.println(bf2.apply("yummy", "Chicken"));
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = s -> s.toUpperCase();

        System.out.println(u1.apply("sum"));
        System.out.println(u2.apply("time"));

        BinaryOperator<String> bo1 = String::concat;
        BinaryOperator<String> bo2 = (s11, toadd) -> s11.concat(toadd);

        System.out.println(bo1.apply("mauritius", "cool"));
        System.out.println(bo2.apply("this", "time for maldives"));
        System.out.println(getAverage(1,3));
        System.out.println(getAverage(0, 0).isPresent());
        Optional<Integer> op = getAverage(0, 0);
        op.ifPresent(a -> System.out.println(a));
//        op.orElse(3);
        op.orElse(5 + 4);
    }

    void play(Gorrila g) {
        System.out.println(g.move());
    }

    public static Optional<Integer> getAverage(int i1, int i2){

        if(i1 ==0 && i2 ==0) return Optional.empty();
        else return Optional.of(i1+i2/2);
    }

}
