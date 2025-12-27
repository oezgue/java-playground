package fernuni.generischeKlassen;

public class Main {
    public static void main(String[] args) {
        GenericPrinter<Integer> dok = new GenericPrinter<>(3);
        dok.print("hello3");
    }
}