package util;

import java.util.function.Function;

public class Utilities {

    /**
     * Runs a function 10 times and returns the fastest application of it
     * @param funcy
     * @param n
     * @return
     * @param <T>
     * @param <U>
     */
    public static <T,U> long measurePerf(Function<T,U> funcy, T n){
        long fastest = Long.MAX_VALUE;
        //for (int i = 0; i<10; i++){
            long start = System.nanoTime();
            funcy.apply(n);
            long duration = (System.nanoTime() - start);
            //System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        //}

        return fastest;
    }
}
