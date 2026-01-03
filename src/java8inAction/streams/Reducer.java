package java8inAction.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reducer {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(12,134,2,25,44,1));

        Integer max = numbers.stream().reduce(0, (a,b)->a>b? a : b);
        System.out.println(max);
    }
}
