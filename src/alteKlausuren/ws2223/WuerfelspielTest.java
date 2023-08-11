package alteKlausuren.ws2223;

class Wuerfelspiel {
    private Wuerfel[] wuerfelFolge;
    public Wuerfelspiel(int x, int y, int z) {
        Wuerfel[] wf = { new Wuerfel(x), new Wuerfel(y),
                new Wuerfel(z) };
        wuerfelFolge = wf;
    }
    /* Ausgabe */
    public void ausgebenMitForSchleife(){
        for (int i = 0; i<3; i++){
            System.out.println(wuerfelFolge[i].augenZahl);

        }
    }
    public void ausgebenMitForEachSchleife(){
        for (Wuerfel wurfel : wuerfelFolge){
            System.out.println(wurfel.augenZahl);
        }
    }
}
class Wuerfel {
    final int augenZahl;
    public Wuerfel() {
        this.augenZahl = 3;
    }
    public Wuerfel(int augenZahl) {
        this.augenZahl = augenZahl;
    }
}
public class WuerfelspielTest {
    public static void main(String[] args) {
        Wuerfelspiel spiel = new Wuerfelspiel(2, 4, 6);
        /* Markierung */
 spiel.ausgebenMitForSchleife();
 spiel.ausgebenMitForEachSchleife();
    }
}
