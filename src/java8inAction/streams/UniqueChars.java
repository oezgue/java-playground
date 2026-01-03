package java8inAction.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueChars {
    public static void main(String[] args) {

    List<String> words = new ArrayList<>(Arrays.asList("Hello", "World"));

    List<String[]> uniqueChars = words
            .stream()
            .map(s -> s.split(""))
            .distinct()
            .collect(Collectors.toList());




    }

}
