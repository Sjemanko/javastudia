package ex_4_1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class PositiveNumbersFilter implements DisplayData, Observer{
    private ArrayList<Integer> storedData;
    private Subject subject;

    public PositiveNumbersFilter(Subject subject)
    {
        storedData = new ArrayList<>();
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nNumbers after positive number filter: ");
        for(Integer number : storedData)
        {
            if(number > 0)
            {
                System.out.printf("%d ", number);
            }
        }
    }



    @Override
    public void update(int inputData) {
        this.storedData.add(inputData);



        display();

    }
}
