public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(13, 56, 1002);
        weatherData.setMeasurements(23, 36, 1012);
        weatherData.setMeasurements(15, 53, 997);


    }
}
