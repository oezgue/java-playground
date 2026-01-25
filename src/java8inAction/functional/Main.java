package java8inAction.functional;

import util.Utilities;

import java.util.stream.LongStream;

public class Main {
    static int factorialIterative (int n){
        int r = 1;
        for (int i = 1; i <= n; i++){
            r *= i;
        }
        return r;
    }

    static long factorialRecursive (long n){
        return (n <= 1)? n : n*factorialRecursive(n-1);
    }

    static long factorialStreams (long n){
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a,b)->a*b);
    }

    public static void main(String[] args) {
        int n = 1_000;

        System.out.println(
        Utilities.measurePerf(Main::factorialIterative, n)
        );

        System.out.println(
                Utilities.measurePerf(Main::factorialRecursive, (long)n)
        );

        System.out.println(
                Utilities.measurePerf(i -> Main.factorialRecursive(i), (long)n)
        );
    }
}
