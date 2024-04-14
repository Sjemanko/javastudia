package ex_4_1;

import java.util.ArrayList;

public class InputData implements Subject{
    int currentValue;

    ArrayList<Observer> observers;

    public InputData() {observers = new ArrayList<>(); }

    public void dataChanged() {notifyObservers();}

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        dataChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
        {
            o.update(this.currentValue);
        }
    }
}
