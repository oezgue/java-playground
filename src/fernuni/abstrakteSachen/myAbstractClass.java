package fernuni.abstrakteSachen;

public abstract class myAbstractClass {
    public int gibZahl() {
        return 42;
    }

    abstract public String gibWort();
}

class myClass extends myAbstractClass {
    @Override
    public String gibWort(){
        return "halo";
    }

    public String gibMehrWort(){
        return "hallo2";
    }

}

class Main {
    public static void main(String[] args) {
        myAbstractClass myClass = new myClass();
        System.out.println(myClass.gibWort());
        System.out.println(myClass.gibZahl());
    }
}
