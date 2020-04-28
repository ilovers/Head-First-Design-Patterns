package headfirst.designpatterns.observer.weather;

public class WeatherStatison {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurement(1, 2, 3);
    weatherData.setMeasurement(2, 3, 4);
  }
}
