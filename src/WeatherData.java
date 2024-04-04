import java.lang.reflect.Array;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;
    ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;

        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
        {
            o.update(temperature, humidity, pressure);
        }
    }
}
