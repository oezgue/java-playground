package java8inAction.lambdas;

/**
 * Nimmt einen int-Wert und gibt einen int-Wert zurück
 */
@FunctionalInterface
public interface Funktion<T> {
    T foo(T x);

    default String info (){
        return "Funktion Version 1.0";
    }

    static String staticInfo(){
        return "Static Funktion V 1.0";
    }
}
