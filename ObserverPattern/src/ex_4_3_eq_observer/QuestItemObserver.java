package ex_4_3_eq_observer;

public class QuestItemObserver implements Observer, Display{
    private Subject subject;
    private String questItem;
    private Integer amountOfQuestItems;

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
    public void update(String lastItemAddedToList, Integer lastItemAddedAmount)
    {
        if(lastItemAddedToList == questItem && lastItemAddedAmount >= amountOfQuestItems)
        {
            displayInfo();
            subject.removeObserver(this);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Quest has been done! " + questItem + ": " + amountOfQuestItems);
    }
}
