package ex_4_2;

import java.util.ArrayList;
import java.util.Map;

public class StockMarket implements Subject{

    ArrayList<Observer> observers;
    Map<String, Double> companyPricings; 

    public StockMarket() { observers = new ArrayList<>(); }    

    public void dataChanged() { notifyObservers(); }

    public void setCompanyPricings(Map<String, Double> updatedPricings)
    {
        this.companyPricings = updatedPricings;
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
            o.update(companyPricings);
        }
    }

}
