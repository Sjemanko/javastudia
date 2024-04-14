package ex_4_1;

public class Equals3Filter implements DisplayData, Observer {
    private int currentValue;
    private Subject subject;

    public Equals3Filter(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int inputData) {
        if(inputData == 3)
        {
            this.currentValue = inputData;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Numbers equals 3: " + this.currentValue);
    }



}
