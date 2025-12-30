package asdf;

import java.util.function.Consumer;

public class CallbackBeispiel {

    public static void verarbeite(int wert, Consumer<Integer> callback) {
        System.out.println("Verarbeite Wert: " + wert);
        callback.accept(wert); // Callback
    }

    public static void main(String[] args) {
        verarbeite(10, ergebnis -> {
             });
    }
}

