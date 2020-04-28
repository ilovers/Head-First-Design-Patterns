package headfirst.designpatterns.decorator.starbuzz;

public class Milk extends CondimentDecorator {
  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " Milk";
  }

  public Double cost() {
    return beverage.cost() + 0.20;
  }
}
