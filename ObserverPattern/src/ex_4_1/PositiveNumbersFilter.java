package ex_4_1;

public class PositiveNumbersFilter implements DisplayData, Observer{
    private int currentValue;
    private Subject subject;

    public PositiveNumbersFilter(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Positive numbers filter: " + this.currentValue);
    }

    @Override
    public void update(int inputData) {
        if(inputData > 0)
        {
            this.currentValue = inputData;
            display();
        } 
    }
}
