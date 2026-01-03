package java8inAction.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyLambda {
    public static <T,R> List<R> map (List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for (T t : list){
            result.add(f.apply(t));
        }
        return result;
    }
    static List<String> listString = Arrays.asList("java","in","action");
    static List<Integer> listInteger = map(listString, String::length);

    public static void main(String[] args) {
        System.out.println(listInteger);
    }
}
