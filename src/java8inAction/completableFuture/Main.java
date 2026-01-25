package java8inAction.completableFuture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private List<Shop> shops = Arrays.asList(new Shop("ebay"),
                                            new Shop("amazon"),
                                            new Shop("etsy"));

    public List<String> findPrices (String product){
        return shops.parallelStream().map(shop-> {
            return shop.getPrice(product) + " " + shop.getName();
        }).collect(Collectors.toList());

    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(
        main.findPrices("schuhe")
        );

    }
}
