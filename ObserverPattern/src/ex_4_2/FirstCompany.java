package ex_4_2;

import java.util.Map;

public class FirstCompany implements Observer, Display{
    private double pricing = 9.241;
    private Subject subject;

    public FirstCompany(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void display()
    {
        System.out.println("FirstCompany pricing: " + this.pricing);
    }

    @Override
    public void update(Map<String, Double> updatedPricings) {
        if(this.pricing != updatedPricings.get("FirstCompany"))
        {
            this.pricing = updatedPricings.get("FirstCompany");
            display();
        }
    }

}
