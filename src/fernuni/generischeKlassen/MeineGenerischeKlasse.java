package fernuni.generischeKlassen;

public class MeineGenerischeKlasse<T> {
    public String printEtwas (){
        return "hello2";
    }


    public static void main (String[] args){
        MeineGenerischeKlasse<String> meineKlasse = new MeineGenerischeKlasse<String>();
        System.out.println(meineKlasse.printEtwas());
    }
}
