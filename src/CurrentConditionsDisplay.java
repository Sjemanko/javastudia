public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temperature: "+  temperature +
                ", humidity: " + humidity +
                ", pressure: " + pressure);
    }
    @Override
    public void update(double temperature, double humidity, double pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

}
