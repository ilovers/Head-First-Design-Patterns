package headfirst.designpatterns.decorator.starbuzz;

public abstract class Beverage {
  public String description = "unknown beverage";

  public abstract Double cost();

  public String getDescription() {
    return description;
  }
}
