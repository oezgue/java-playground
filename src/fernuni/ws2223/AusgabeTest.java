package fernuni.ws2223;

class Nahrung { }
class Obst extends Nahrung { }
class Gemuese extends Nahrung { }
class Spinat extends Gemuese { }
class Apfel extends Obst { }
class Super {
    void m(Nahrung n, Obst o) {
        System.out.println("1");
    }
    void m(Gemuese g, Apfel a) {
        System.out.println("2");
    }
    void m(Nahrung n, Spinat s) {
        System.out.println("3");
    }
    void m(Spinat s, Gemuese g) {
        System.out.println("4");
    }
}
class Sub extends Super {
    void m(Gemuese g, Spinat s) {
        System.out.println("5");
    }
    void m(Nahrung n, Obst o) {
        System.out.println("6");
    }
}
public class AusgabeTest {
    public static void main(String[] args) {
        Super s1 = new Super();
        Super s2 = new Sub();
        Nahrung n = new Nahrung();
        Obst o = new Apfel();
        Apfel a = new Apfel();
        Gemuese g = new Gemuese();
        Spinat s = new Spinat();
        /* Markierung */
        s1.m(s, a);
    }
}
