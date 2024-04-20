package ex_4_3_eq_observer;

import java.util.HashMap;

public class AddedItemsObserver implements Observer, Display{
    private Subject subject;
    private HashMap<String, Integer> itemsList;
    private String lastItemAddedToList;

    public AddedItemsObserver(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nUpdated item : " + lastItemAddedToList);
        System.out.println("\nCurrent equipment items: ");
        for (String name: itemsList.keySet()) {
            String key = name.toString();
            String value = itemsList.get(name).toString();
            System.out.println(key + " - " + value);
        }
    }

    @Override
    public void update(HashMap<String, Integer> itemsList, String lastItemAddedToList) {
        this.itemsList = itemsList;
        this.lastItemAddedToList = lastItemAddedToList;
        displayInfo();
    }

}
