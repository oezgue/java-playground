package java8inAction.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairOfNumbers {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1,2,3);
        List<Integer> nums2 = Arrays.asList(4,5);

        List<Integer[]> list = nums1.stream()
                .flatMap(n1 -> nums2.stream()
                        .map(n2 -> new Integer[]{n1,n2}))
                .filter(arr -> (arr[0]+arr[1]) % 3 == 0)
                .collect(Collectors.toList());

        list.forEach(e -> System.out.println(e[0] + " " + e[1]));
    }
}
