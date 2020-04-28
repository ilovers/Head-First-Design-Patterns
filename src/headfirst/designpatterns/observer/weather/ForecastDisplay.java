package headfirst.designpatterns.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
  private Subject weatherData;
  private float temperature;
  private float humidity;
  private float pressure;

  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println(
        "ForecastDisplay: "
            + this.temperature
            + " F degrees and"
            + this.humidity
            + " % humidity"
            + this.pressure
            + " pressure ");
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
