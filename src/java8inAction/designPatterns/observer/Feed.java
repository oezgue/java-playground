package java8inAction.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(o-> o.notify(tweet));
    }
}
