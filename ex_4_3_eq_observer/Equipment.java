package ex_4_3_eq_observer;

import java.util.ArrayList;
import java.util.HashMap;

public class Equipment implements Subject {
    private HashMap<String, Integer> itemList;
    private String lastItemAddedToList;
    ArrayList<Observer> observers;

    public Equipment() {
        observers = new ArrayList<>();
        itemList = new HashMap<>();
    }

    public void addItemToList(String item, Integer amount)
    {
        if(itemList.containsKey(item))
        {
            itemList.put(item, itemList.get(item) + amount);
        } else {
            itemList.put(item, amount);
        }
        this.lastItemAddedToList = item;
        notifyObservers();
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
            o.update(itemList, lastItemAddedToList);
        }
    }
}
