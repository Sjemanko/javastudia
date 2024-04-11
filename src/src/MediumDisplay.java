import static java.lang.Math.max;
import static java.lang.Math.min;

public class MediumDisplay implements DisplayElement, Observer{
    private double minTemperature;
    private double maxTemperature;
    private double sumTemperature;

    private double minHumidity;
    private double maxHumidity;
    private double sumHumidity;

    private double minPressure;
    private double maxPressure;
    private double sumPressure;

    private double sum=0;

    private Subject subject;

    public MediumDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Medium Temperature: "+  sumTemperature/sum +
                ", medium humidity: " + sumHumidity/sum +
                ", medium pressure: " + sumPressure/sum +
                " maximum Temperature: "+  maxTemperature +
                ", maximum humidity: " + maxHumidity +
                ", maximum pressure: " + maxPressure);
    }
    @Override
    public void update(double temperature, double humidity, double pressure){
        this.minPressure = min(this.minPressure, pressure);
        this.minHumidity = min(this.minHumidity, humidity);
        this.minTemperature = min(this.minTemperature, temperature);
        this.maxPressure = max(this.maxPressure, pressure);
        this.maxHumidity = max(this.maxHumidity, humidity);
        this.maxTemperature = max(this.maxTemperature, temperature);
        this.sumHumidity += humidity;
        this.sumPressure += pressure;
        this.sumTemperature += temperature;

        this.sum+=1;
        display();
    }

}
