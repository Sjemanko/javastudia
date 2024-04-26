package ex_4_3_eq_observer;

public class QuestItemObserver implements Observer, Display{
    private Subject subject;
    private String questItem;
    private Integer amountOfQuestItems;
    private Integer questItemCurrentAmount;

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
    public void update(String lastItemAddedToList, Integer lastItemAddedCurrentAmount)
    {
        if(lastItemAddedToList == questItem)
        {
            this.questItemCurrentAmount = lastItemAddedCurrentAmount;
            showCurrentQuestState();
            if(this.questItemCurrentAmount >= amountOfQuestItems)
            {
                displayInfo();
                subject.removeObserver(this);
            }
        }
    }

    public void showCurrentQuestState()
    {
        System.out.println("Current quest state: " + questItemCurrentAmount + "/" + amountOfQuestItems);
    }

    @Override
    public void displayInfo() {
        System.out.println("Quest has been done! " + questItem + ": " + amountOfQuestItems);
    }
}
