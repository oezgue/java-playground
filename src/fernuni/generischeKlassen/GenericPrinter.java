package fernuni.generischeKlassen;

public class GenericPrinter<T> {
    T thingToPrint;

    public GenericPrinter (T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public <K> void print (K thing){
        System.out.println(thing);
    }
}
