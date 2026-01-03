package java8inAction.streams.aufgaben;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //init
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
                );

        // Find all transactions in the year 2011 and sort them by value (low to high).
        List<Transaction> transactions2011 = transactions.stream()
                .filter( transaction -> transaction.getYear()==2011)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(Collectors.toList());
        System.out.println("Exercise1:");
        System.out.println(transactions2011);

        // Find all the unique cities where the traders work.
        List<String> uniqueCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Exercise2: Unique Cities");
        System.out.println(uniqueCities);

        // Find all traders from Cambridge and sort them by name.
        List<Trader> tradersFromC = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(t -> t.getName()))
                .collect(Collectors.toList());
        System.out.println("Exercise3: Traders from C");
        System.out.println(tradersFromC);

        // Return a String of all traders' name sorted alphabetically.
        Optional<String> allTradersOptional = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((a,b) -> a + " " + b );
                // for better performance
                // Alternatively use: .collect(Collectors.joining()) instead of .reduce(...)


        String allTraders = allTradersOptional.isPresent()? allTradersOptional.get() : "No Traders";
        System.out.println("Exercise4: All traders as String");
        System.out.println(allTraders);

        // Are any traders based in Milan?
        Boolean isFromMilan = transactions.stream()
                .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
        System.out.println("Exercise5: Is there a trader from Milan?");
        System.out.println(isFromMilan);

        // Print all transactions' values from the traders living in Cambridge
        System.out.println("Exercise6: Print all transactions of traders from C");
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .forEach(t-> System.out.println(t.getValue()));

        // What's the highest value of all the transactions?
        int maxValue = transactions.stream()
                .mapToInt(t -> t.getValue())
                .max().orElse(0);
        System.out.println("Exercise7: Find highest value of all transactions");
        System.out.println(maxValue);

        // Find the transaction with the smallest value
        Transaction smallestTransaction = transactions.stream()
                .reduce((t1, t2) -> (t1.getValue()<t2.getValue())? t1 : t2)
                .orElse(new Transaction(new Trader("Nobody", "Nowhere"), 0 ,0));
        System.out.println("Find the transaction with the smallest value");
        System.out.println(smallestTransaction);




    }
}
