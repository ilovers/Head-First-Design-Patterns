package headfirst.designpatterns.decorator.starbuzz;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "HouseBlend";
  }

  public Double cost() {
    return 2.9;
  }
}
