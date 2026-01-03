package java8inAction.lambdas;


import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambdas {


    public static void printIt(int x, Funktion<Integer> f){
        System.out.println(f.foo(x));
    }

    public static void whatsSup(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    public static void defCon (int i, Consumer<Integer> con){
        con.accept(i);
    }

    public static void main(String[] args) {

        // Interface Funktion: int foo(int x);
        // 1. Methode - Objekt als Parameter
        Funktion<Integer> klasse = new Funktion<Integer>() {
            @Override
            public Integer foo(Integer x) {
                return x*4;
            }
        };
        printIt(1, klasse);

        // 2. Methode - Anonyme Klasse
        printIt(1, new Funktion<Integer>() {
            public Integer foo(Integer x){
            return x*2;
            }
        });

        // 3. Methode - Lambda
        printIt(3, x -> x*4);

        // Supplier (Producer)
        whatsSup(()->"Hello");

        defCon(40, x-> System.out.println(x));
        // shorter with Method Reference
        defCon (80, System.out::println);

    }
}
