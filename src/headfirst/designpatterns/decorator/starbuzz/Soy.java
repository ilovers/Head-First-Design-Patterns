package headfirst.designpatterns.decorator.starbuzz;

public class Soy extends CondimentDecorator {
  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " Soy";
  }

  public Double cost() {
    return beverage.cost() + 0.10;
  }
}
