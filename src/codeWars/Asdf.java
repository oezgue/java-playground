package codeWars;
// Parent Class
public class Asdf {
    int someInt;

    public Asdf(){

    }
    public void someMethod(){
        System.out.println("someMethod in Asdf");

    }
}

class Asdfg extends Asdf{

        }

class AsdfTester {
    public static void main(String[] args) {
        Asdf asdf = new Asdf();
    }
}
