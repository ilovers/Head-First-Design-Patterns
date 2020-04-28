package headfirst.designpatterns.decorator.starbuzz;

public class Starbuzz {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    beverage = new Milk(beverage);
    beverage = new Mocha(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}
