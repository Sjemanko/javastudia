package ex_4_3_eq_observer;

import java.util.ArrayList;
import java.util.HashMap;

public class Equipment implements Subject {
    private HashMap<String, Integer> itemList;
    private String lastItemAddedToList;
    private Integer lastItemAddedCurrentAmount;
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
        this.lastItemAddedCurrentAmount = itemList.get(item);
        notifyObservers();
    }

    public void removeItemFromList(String item, Integer amount)
    {
        if(itemList.containsKey(item) && itemList.get(item) <= amount)
        {
            itemList.remove(item);
            notifyObservers();
        } else if (itemList.containsKey(item) && itemList.get(item) >= amount)
        {
            itemList.put(item, itemList.get(item) - amount);
            notifyObservers();
        }
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
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(lastItemAddedToList, lastItemAddedCurrentAmount);
        }

        System.out.println("\nCurrent equipment items: ");
        for (String name: itemList.keySet()) {
            String key = name.toString();
            String value = itemList.get(name).toString();
            System.out.println(key + " - " + value);
        }
    }
}
