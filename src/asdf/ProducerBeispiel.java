package asdf;

import java.util.function.Supplier;

public class ProducerBeispiel {
    public static void nutzeProducer(Supplier<Integer> producer) {
        int wert = producer.get();
        System.out.println("Gelieferter Wert: " + wert);
    }

    public static void main(String[] args) {
        nutzeProducer(() -> 42);
    }
}

