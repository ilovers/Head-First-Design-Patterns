package headfirst.designpatterns.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Cheese createCheese() {
    return new SmallCheese();
  }

  public Clam createClam() {
    return new SmallClam();
  }
}
