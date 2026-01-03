package java8inAction.streams;

import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        IntStream.range(1,5).forEach(System.out::println);


        IntStream intStream = IntStream.rangeClosed(1,100).filter(n->n%2 == 0);
        System.out.println(intStream.count());
    }
}
