package fernuni.ws2223;

class Stellplatz <T extends Fahrzeug> {


    T element;

    public void einparken(T element){
        this.element = element;
    }

    public T ausparken(){
        return element;
    }

}
