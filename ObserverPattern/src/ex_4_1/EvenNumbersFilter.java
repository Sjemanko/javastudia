package ex_4_1;

public class EvenNumbersFilter implements DisplayData, Observer {
    private int currentData;
    private Subject subject;

    public EvenNumbersFilter(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int inputData) {
        if(inputData % 2 == 0)
        {
            this.currentData = inputData;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Even numbers: " + this.currentData);
    }

}
