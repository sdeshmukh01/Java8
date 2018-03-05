/**
 * Created by himu on 2/25/2018.
 */
public class Test {

    static class A {
        public B test() {
            return new B();
        }
    }

    static class B extends A {

        @Override
        public B test() {
            A a = new B();
            return (B) a;
        }
    }
    public static void main(String[] args) {

C c = (d -> {
   String f = "";
    return "poof";
});

    }

}
