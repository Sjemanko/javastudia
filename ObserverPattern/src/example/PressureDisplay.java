package example;
import java.util.ArrayList;

public class PressureDisplay implements DisplayElement, Observer{
    private double pressure;
    Subject subject;

    ArrayList<Double> pressureHistory;

    public PressureDisplay(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Pressure Display: " + pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if(this.pressure == 0.0){
            this.pressure = pressure;
        }
        else{
            if(this.pressure > pressure){
                System.out.println(" Pogoda się psuje");
            }
            else{
                System.out.println(" Pogoda się poprawia");
            }
            this.pressure = pressure;

        }

    }
}
