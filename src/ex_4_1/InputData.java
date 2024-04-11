package ex_4_1;

import java.util.ArrayList;

public class InputData implements Subject{
    int currentValue;

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        dataChanged();
    }

    ArrayList<Observer> observers;

    public InputData() {observers = new ArrayList<>(); }

    public void ReadData()
    {
        // console.readline cos tam
    }

    public void dataChanged() {notifyObservers();}

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
