package headfirst.designpatterns.decorator.starbuzz;

public class Whip extends CondimentDecorator {
  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " Whip";
  }

  public Double cost() {
    return beverage.cost() + 0.50;
  }
}
