package exceptions;

public class AusnahmeTest  {
public static void gibMirGeradeZahl (int i) throws Ausnahme {
    if (i%2 == 0) {
        System.out.println("danke");
    } else {
        throw new Ausnahme("keine gerade Zahl!");
    }
}
    public static void main(String[] args) throws Ausnahme{
        System.out.println("hallo");
        try {
            gibMirGeradeZahl(3);
        } catch (Ausnahme e){
            System.out.println("fehler!");
            throw e;
        }
        System.out.println("durmak yok yola devam");

    }


}
