package example;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        PressureDisplay pd = new PressureDisplay(weatherData);
        MediumDisplay md = new MediumDisplay(weatherData);

        weatherData.setMeasurements(13, 56, 1002);
        weatherData.setMeasurements(23, 36, 1012);
        weatherData.setMeasurements(15, 53, 997);
    }
}
