package methodenaufruf;

import java.util.ArrayList;
import java.util.List;

public class ClassTest {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(4);
        liste.add(3);
        liste.add(2);
        liste.add(1);
        for (Integer i : liste){
            System.out.println(i);
        }
        aendereListe(liste);
        System.out.println("****");
        for (Integer i : liste){
            System.out.println(i);
        }
    }

    public static void aendereListe (List liste){
        liste.add(0);

    }
}
