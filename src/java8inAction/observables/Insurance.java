package java8inAction.observables;

import java.util.Optional;

public class Insurance {
    final int id;
    final String insuranceName;
    private Optional<Car> car = Optional.empty();;

    public Insurance(int id, String insuranceName) {
        this.id = id;
        this.insuranceName = insuranceName;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }


    public int getId() {
        return id;
    }

    public String getInsuranceName() {
        return insuranceName;
    }
}
