package headfirst.designpatterns.decorator.starbuzz;

public class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso";
  }

  public Double cost() {
    return 1.99;
  }
}
