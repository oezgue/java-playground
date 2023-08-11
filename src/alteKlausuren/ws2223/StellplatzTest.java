package alteKlausuren.ws2223;

abstract class Fahrzeug {}
class Auto extends Fahrzeug {}
class Motorrad extends Fahrzeug {}
public class StellplatzTest {
    public static void main(String[] args) {
        Stellplatz<Auto> stellPlatz = new Stellplatz<Auto>();
        Auto auto = new Auto();
        stellPlatz.einparken(auto);
        auto = stellPlatz.ausparken();
        System.out.println(auto);
        System.out.println(stellPlatz.ausparken());
    }
}
