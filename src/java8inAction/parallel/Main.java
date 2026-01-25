package java8inAction.parallel;

import util.Utilities;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    public static long sequentialSum (long n){
        return Stream.iterate(1L, i -> i+1)
                .limit(n)
                //.parallel()
                .reduce(0L, (n1,n2)-> Long.sum(n1,n2));
    }

    public static long measureSumPerf(Function<Long,Long> adder, long n){
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i<10; i++){
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            //System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }

        return fastest;
    }

    public static void main(String[] args) {

        Function<Long,Long> myFunction = n -> Stream.iterate(1L, i -> i+1)
                .limit(n)
                //.parallel()
                .reduce(0L, (n1,n2)-> Long.sum(n1,n2));


        //System.out.println(measureSumPerf(myFunction, 10_000_000) + " ms");
        System.out.println(Utilities.measurePerf(myFunction, 10_000_000L) + " ms");


    }
}
