package java8inAction.observables;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //init
        Insurance insurance = new Insurance(123,"Alfa Insurance");
        Optional<Car> car = Optional.of(new Car("VW"));
        Person person = new Person();
        //insurance.setCar(car);

        //no Person set -> Null

        //Optional Training
        String personName = Optional.of(insurance)
                                .flatMap(Insurance::getCar)// weil Car ein Optional ist, hier flatMap anwenden
                                .map(Car::getPerson)
                                .map(Person::getName)
                                .orElse("leer");
        System.out.println(personName);



    }
}
