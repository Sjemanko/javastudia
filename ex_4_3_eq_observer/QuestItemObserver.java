package ex_4_3_eq_observer;

import java.util.HashMap;

public class QuestItemObserver implements Observer, QuestInfoDisplay{
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
        } else
        {
            System.out.println("Added new item (no quest connection): " + lastItemAddedToList);
            System.out.println();
            System.out.println("Current equipment items: ");
            for (String name: itemList.keySet()) {
                String key = name.toString();
                String value = itemList.get(name).toString();
                System.out.println(key + " " + value);
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Searched quest item: " + questItem + "\n"
                + "Amount of quest item: " + itemList.get(questItem) + "/" + amountOfQuestItems
            );
        if(itemList.get(questItem) >= amountOfQuestItems)
        {
            System.out.println("Quest has been completed!");
        }
    }
}
