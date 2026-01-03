package java8inAction.streams;

import java8inAction.lambdas.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsExample {


    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(Arrays.asList(new Apple("red",200),
                new Apple("green", 100), new Apple("green", 50), new Apple("green", 300),
                new Apple("green", 333),new Apple("green", 111),new Apple("red", 160)
        ));

        List<String> applesSorted = apples.stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .sorted(Comparator.comparing(Apple::getColor))
                .map(Apple::getColor)
                .distinct()
                .collect(toList());

                //.collect(Collectors.toList());
        applesSorted.forEach(item -> System.out.println(item));
    }


}
