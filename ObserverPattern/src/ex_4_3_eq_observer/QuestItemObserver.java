package ex_4_3_eq_observer;

import java.util.HashMap;

public class QuestItemObserver implements Observer, Display{
    private Subject subject;
    private String questItem;
    private Integer amountOfQuestItems;
    private HashMap<String, Integer> itemList;

    public QuestItemObserver(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void setQuestItemAndAmount(String item, Integer amountOfQuestItems)
    {
        this.questItem = item;
        this.amountOfQuestItems = amountOfQuestItems;
    }

    @Override
    public void update(HashMap<String, Integer> itemsList, String lastItemAddedToList) {
        this.itemList = itemsList;
        if(lastItemAddedToList == questItem)
        {
            displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSearched quest item: " + questItem + "\n"
                + "Amount of quest item: " + itemList.get(questItem) + "/" + amountOfQuestItems
            );
        if(itemList.get(questItem) >= amountOfQuestItems)
        {
            System.out.println("Quest has been completed!");
            subject.removeObserver(this);
        }
    }
}
