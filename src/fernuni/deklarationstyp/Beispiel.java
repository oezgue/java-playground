package fernuni.deklarationstyp;

public class Beispiel {
    public static void main(String[] args) {
        Super s = new Sub();
        s.m();
    }
}

class Super {
    public void m () {
        System.out.println("ich bin Super");
    }
}

class Sub extends Super {
    @Override
    public void m () {
        System.out.println("ich bin Sub");
    }
}

