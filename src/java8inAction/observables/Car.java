package java8inAction.observables;

public class Car {

    final String model;
    private Person person;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
