package ex_4_2;

import java.util.Map;

public class SecondCompany implements Display, Observer {
    private double pricing = 4.92;

    private Subject subject;

    public SecondCompany(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    } 


    @Override
    public void update(Map<String, Double> updatedPricings) {
        if(this.pricing != updatedPricings.get("SecondCompany"))
        {
            this.pricing = updatedPricings.get("SecondCompany");
            display();
        } 
    } 
    
    @Override
    public void display() {
        System.out.println("SecondCompany pricing: " + this.pricing);
    }

}
