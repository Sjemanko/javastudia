package ex_4_3_eq_observer;

import java.util.HashMap;

public class AddedItemsObserver implements Observer, Display{
    private Subject subject;
    private HashMap<String, Integer> itemsList;
    private String lastItemAddedToList;
    private Integer lastItemAddedAmount;

    public AddedItemsObserver(Subject subject)
    {
        this.subject = subject;
        this.itemsList = new HashMap<>();
        subject.registerObserver(this);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nUpdated item : " + lastItemAddedToList + ", amount: " + lastItemAddedAmount);
    }

    @Override
    public void update(String lastItemAddedToList, Integer lastItemAddedAmount) {
        this.lastItemAddedToList = lastItemAddedToList;
        this.lastItemAddedAmount = lastItemAddedAmount;
        displayInfo();
    }
}
