package headfirst.designpatterns.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private Subject weatherData;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println(
        "CurrentConditionsDisplay: "
            + this.temperature
            + " F degrees and "
            + this.humidity
            + " % humidity");
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
}
