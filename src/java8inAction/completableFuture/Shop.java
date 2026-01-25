package java8inAction.completableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.lang.Math.random;
import static java8inAction.completableFuture.Util.delay;

public class Shop {
    final String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice (String product){

        return calculatePrice(product);
    }

    private double calculatePrice(String product){
        delay();
        Random random = new Random();
        double value =  random.nextDouble()*product.charAt(0) + product.charAt(1);

        return Math.round(value * 100)/100.0;
    }

//    public Future<Double> getPriceAsync (String product){
//        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
//        new Thread( () ->
//        {
//            try {
//                double price = calculatePrice(product);
//                futurePrice.complete(price);
//            } catch (Exception ex){
//                futurePrice.completeExceptionally(ex);
//            }
//        }).start();
//        return futurePrice;
//    }

    public Future<Double> getPriceAsync (String product){
        return CompletableFuture.supplyAsync(()-> calculatePrice(product));
    }


    public static void main(String[] args) {
        Shop ebay = new Shop("ebaya");
        long start = System.nanoTime();
        Future<Double> futurePrice = ebay.getPriceAsync("Haus Schuhe");
        long invocationTime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("invocation returned after: " + invocationTime + " msecs");

        // Do something else
        System.out.println("Hello neighbour");

        try {
            double price = futurePrice.get();
            System.out.println("Price is " + price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("invocation returned after: " + retrievalTime + " msecs");

    }
}
