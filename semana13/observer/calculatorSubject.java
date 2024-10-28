package observer;

import java.util.ArrayList;
import java.util.List;

public class calculatorSubject {
    private List<calculatorObserver> observers = new ArrayList<>();

    public void addObserver(calculatorObserver observer){
        observers.add(observer);
    }

    public void notifyObserver(String value){
        for(calculatorObserver observer : observers){
            observer.update(value);
        }
    }
}
