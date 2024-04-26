package ex_4_3_eq_observer;

public class AddedItemsObserver implements Observer, Display{
    private Subject subject;
    private String lastItemAddedToList;
    private Integer lastItemAddedAmount;

    public AddedItemsObserver(Subject subject)
    {
        this.subject = subject;
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
