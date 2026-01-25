package java8inAction.collector;

import java8inAction.lambdas.Apple;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(Arrays.asList(new Apple("red",200),
                new Apple("green", 100), new Apple("green", 50), new Apple("green", 300),
                new Apple("green", 333),new Apple("green", 111),new Apple("red", 160)
        ));

        List<Apple> appleList = apples.stream().collect(new ListCollector<Apple>());
        //System.out.println(appleList);

        // gruppiere nach gewicht UND farbe
        Map<String, Map<String, List<Apple>>> map =apples.stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .collect(Collectors.groupingBy(a -> {
            if (a.getWeight() >150) {
                return "heavy";
            } else {
                return "light";
            }
        },  Collectors.groupingBy(Apple::getColor)));

        // Gruppiere nach Gewicht UND erstelle Liste
        Map<String, List<Apple>> list =apples.stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .collect(Collectors.groupingBy(a -> {
                    if (a.getWeight() >150) {
                        return "heavy";
                    } else {
                        return "light";
                    }
                },  Collectors.toList()));
        System.out.println(map);
        System.out.println(list);
    }
}
