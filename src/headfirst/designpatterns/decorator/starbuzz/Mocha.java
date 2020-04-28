package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " Mocha";
  }

  public Double cost() {
    return beverage.cost() + 0.30;
  }
}
