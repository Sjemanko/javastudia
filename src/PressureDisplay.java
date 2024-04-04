import java.lang.reflect.Array;
import java.util.ArrayList;

public class PressureDisplay implements DisplayElement, Observer{
    private double pressure;
    Subject subject;

    ArrayList<Double> pressureHistory;

    public PressureDisplay(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
        this.pressureHistory = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(" Pressure Display: pressure: " + pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.pressure = pressure;


    }
}
